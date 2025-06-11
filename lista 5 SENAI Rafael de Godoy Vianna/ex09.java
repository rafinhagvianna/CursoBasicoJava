import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 1234;
        System.out.println("Digite sua senha: ");
        senha = sc.nextInt();
        while (senha != 1234) {
            System.out.println("Senha incorreta, digite novamente:");
            senha = sc.nextInt();
        }
        System.out.println("senha correta!");

        sc.close();

    }
}