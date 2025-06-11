import java.util.Scanner;

public class ex27 {
    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int N = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nPrograma finalizado.");
        scanner.close();
    }
}
