import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa verifica se o número informado é primo ou não;");
        System.out.println("Informe o número:");
        int n = sc.nextInt();
        if (n == 2 || n == 3) {
            System.out.println("O número é primo.");
        } else if (n % 2 == 0 || n % 3 == 0 || n == 1) {
            System.out.println("O número não é  primo.");


        } else System.out.println("O número é primo.");


    }
}
