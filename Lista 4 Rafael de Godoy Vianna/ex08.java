import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da pirâmide: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
