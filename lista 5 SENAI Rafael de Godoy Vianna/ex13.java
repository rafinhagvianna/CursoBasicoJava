import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        System.out.println("Insira o número que deseja calcular o fatorial.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é " + fatorial);
    }
}
