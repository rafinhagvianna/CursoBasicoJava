import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano desejado.");
        int ano = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Este ano é bissexto");
        }else
            System.out.println("Este ano não é bissexto");
    }
}
