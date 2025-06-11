import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome e a sua idade");
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos");

    }
}
