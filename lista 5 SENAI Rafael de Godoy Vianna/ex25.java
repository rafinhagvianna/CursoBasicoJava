import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para observar todos seus divisores.");
        int n = sc.nextInt();
        System.out.println("Abaixo todos os divisores de " + n + ":");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
