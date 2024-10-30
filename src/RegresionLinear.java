public class RegresionLinear {
    double b0; //intersección
    double b1;//pendiente

    //Métodod para calcular las sumatorias
    public void predecirB0B1(Puntos[] puntos){
        int n = puntos.length;
        //Llamo a los métodos de calculos para las sumatorias
        double sumX = Calculos.sumarX(puntos);
        double sumY = Calculos.sumarY(puntos);
        double sumYX = Calculos.sumarXY(puntos);
        double sumXcuad = Calculos.sumarCuadrados(puntos);

        //Almaceno el resultado de las ecuaciónes en 2 variables
        b1 = Math.round((n * sumYX - sumX * sumY) / (n * sumXcuad - sumX * sumX));
        b0 = Math.round((sumXcuad*sumY - sumX*sumYX) / (n *sumXcuad - sumX*sumX));
    }


    //Utilizo la ecucaión de la LRS para predecir
    public double predecir(double x){
        return Math.round(b1 * x + b0);
    }

    //Obtengo los valores de b1 y b0
    public double getB0() {
        return b0;
    }

    public double getB1() {
        return b1;
    }
}
