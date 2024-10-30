public class TestRegresionCuadratica {
    public static void main(String[] args) {

        RegresionCuadratica cuadratica = new RegresionCuadratica();

        Puntos[] puntos = {
                new Puntos(-3, 7.5),
                new Puntos(-2, 3),
                new Puntos(-1, 0.5),
                new Puntos(0, 1),
                new Puntos(1, 3),
                new Puntos(2, 6),
                new Puntos(3, 14),
        };
        cuadratica.calcular(puntos);

        System.out.println("Regresión cuadratica: ");
        System.out.println("La formula es: "+cuadratica.getA()+" * x^2 + "+cuadratica.getB()+" * x + "+cuadratica.getC());
        System.out.println();
        System.out.println("Coeficiente a: "+cuadratica.getA());
        System.out.println("Coefeiciente b: "+cuadratica.getB());
        System.out.println("Coeficiente c: "+cuadratica.getC());
        double x = 120;
        System.out.println("Predicción para "+x+" es igual a: "+cuadratica.predecir(x));

    }
}
