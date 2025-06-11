import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua idade.");
        int idade = sc.nextInt();
        if (idade <= 12) {
            System.out.println("Você é criança");
        } else if (idade > 12 && idade < 18) {
            System.out.println("Você é adolescente");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto");

        }else
            System.out.println("Você é idoso");
    }
}