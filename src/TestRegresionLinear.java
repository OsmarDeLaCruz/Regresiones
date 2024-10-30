public class TestRegresionLinear {
    public static void main(String[] args) {
        double x = 60;
        RegresionLinear regresion = new RegresionLinear();

        Puntos[] puntos = {
                new Puntos(1, 3),
                new Puntos(2, 6),
                new Puntos(3, 9),
                new Puntos(4, 12),
                new Puntos(5, 15),
                new Puntos(6, 18),
                new Puntos(7, 21),
                new Puntos(8, 24),
                new Puntos(9, 27)
        };
        regresion.predecirB0B1(puntos);

        System.out.println("Regresión linear");
        System.out.println("La ecuación es y= " + regresion.getB1() + " * X + " + regresion.getB0());
        System.out.println();
        System.out.println("pendiente: " + regresion.getB1());
        System.out.println("Intersección: " + regresion.getB0());

        System.out.println("Valor a predecir: " + x + " = " + regresion.predecir(x));
    }
}
