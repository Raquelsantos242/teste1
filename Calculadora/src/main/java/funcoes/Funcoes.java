package funcoes;

public class Funcoes {
    public static double somarValores(double x, double y, double z) {
        z = y + x;
        return z;
    }

    public static double multiplicarValores(double x, double y, double z) {
        z = x * y;
        return z;
    }

    public static double subtrairValores(double x, double y, double z) {
        z = x - y;
        return z;
    }

    public static double dividirValores(double x, double y, double z) {
        z = x / y;
        return z;
    }

    public static double restoDivisao(double x, double y, double z) {
        z = x % y;
        return z;
    }

    public static double potenciaValores(double x, double y, double z) {
        z = Math.pow(x, y);
        return z;
    }
}
