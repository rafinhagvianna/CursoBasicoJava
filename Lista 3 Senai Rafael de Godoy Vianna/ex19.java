import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é divisível tanto por 3 quanto por 4.");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 4 == 0) {
            System.out.println("O número é divisível tanto por 3 quanto por 4.");

        }else if (n % 3 == 0) {
            System.out.println("O número é divisível somente por 3.");
        }else if (n % 4 == 0) {
            System.out.println("O número é divisível somente por 4.");

        }else
            System.out.println("O número não é divisível nem por 3 nem por 4.");
    }
}
