import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        System.out.println("informe a sua nota de 0 a 10.");
        Scanner leitor = new Scanner(System.in);
        int nota = leitor.nextInt();

        if (nota >= 6 && nota <= 10) {
            System.out.println("Aprovado.");

        }else if (nota<0 || nota>10) {
            System.out.println("Insira um valor válido");
        }else
            System.out.println("Reprovado.");


    }
}
