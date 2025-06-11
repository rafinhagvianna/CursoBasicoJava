import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nota de 1 a 10");
        double nota1 = sc.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Insira uma nota válida.");
        } else {
            System.out.println("OK.");
        }
    }
}
