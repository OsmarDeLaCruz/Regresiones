public class RegresionCuadratica {
    private double a,b,c;

    public void calcular(Puntos[] puntos){
        double n = puntos.length;
        double sumX =0, sumX2 = 0, sumX3 = 0, sumX4 = 0;
        double sumY = 0, sumXY = 0, sumX2y = 0;

        //obtener los valores para las sumatorias
        for (Puntos punt : puntos){ //Receorro los puntos con un for-ech
            double x = punt.getX();
            double y = punt.getY();
            double x2 = x * x;
            double x3 = x2 * x;
            double x4 = x3 * x;

            //Sumatorias
            sumX += x;//Sumo los valores de cada iteración
            sumX2 += x2;
            sumX3 += x3;
            sumX4 += x4;
            sumY += y;
            sumXY += x * y;
            sumX2y += x2 * y;
        }

        //Hago la matriz A con las sumatorias
        double[][] A = {
                {n, sumX, sumX2},
                {sumX, sumX2, sumX3},
                {sumX2, sumX3, sumX4}
        };
        //Establesco el vector de las sumatorias de y
        double[] B = {sumY, sumXY, sumX2y};
        //Calculo el sistema de la matiz y el vector, obteniendo un vector como solución
        double[] solucion = Calculos.resolverSistema(A,B);

        //Obtengo los valores de las betas(a,b,c) del vector solución
        this.c = solucion[0];
        this.b = solucion[1];
        this.a = solucion[2];
    }

    //Útilizo la ecucación de la SR para predecir
    public double predecir(double x){
        return a * x * x + b * x + c;
    }

    //Obtengo los datos
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
