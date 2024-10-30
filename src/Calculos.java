public class Calculos {

    //Sumatoria para los puntos x
    public static double sumarX(Puntos[] puntos){
        double sumX = 0;
        for (Puntos punto : puntos){
            sumX += punto.getX();
        }
        return sumX;
    }

    //sumaria para los puntos y
    public static double sumarY(Puntos[] puntos){
        double sumY = 0;
        for (Puntos pun : puntos){
            sumY += pun.getY();
        }
        return sumY;
    }

    //sumatoria xy
    public static double sumarXY(Puntos[] puntos){
        double sumXY = 0;
        for (Puntos pun : puntos){
            sumXY += pun.getX() * pun.getY();
        }
        return sumXY;
    }

    //sumatoria para los puntos x al cuadrado
    public static double sumarCuadrados(Puntos[] puntos){
        double sumCuad = 0;
        for (Puntos pun : puntos){
            sumCuad += pun.getX() * pun.getX();
        }
        return sumCuad;
    }

    //Se resuelve el sistema de ecuaciones por el método de Gauss
    public static double[] resolverSistema(double[][] A, double [] B){
        int n = B.length;

        for (int i = 0; i < n; i++){
            double factor = A[i][i];
            for (int j = 0; j < n; j++){
                A[i][j] /= factor;
            }
            B[i] /= factor;

            for (int k = i+1; k < n; k++){
                factor = A[k][i];
                for (int j = 0; j < n; j++){
                    A[k][j] -= factor * A[i][j];
                }
                B[k] -= factor * B[i];
            }
        }
        double[] X = new double[n];

        for (int i = n-1; i >= 0; i--){
            X[i] = B[i];
            for (int j = i+1; j < n; j++){
                X[i] -= A[i][j] *X[j];
            }
        }
        return X;
    }
}
