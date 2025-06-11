public class MathUtility {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("O fatorial não é definido para números negativos.");
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double power(double base, int expoente) {
        return Math.pow(base, expoente);
    }

    public static void main(String[] args) {
        System.out.println("Soma: " + MathUtility.add(5, 3));
        System.out.println("Multiplicação: " + MathUtility.multiply(4, 7));
        System.out.println("Máximo de três números: " + MathUtility.maxOfThree(10, 25, 15));
        System.out.println("Fatorial de 5: " + MathUtility.factorial(5));
        System.out.println("Exponenciação (2^4): " + MathUtility.power(2, 4));
    }
}
