import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        System.out.println("Escolha um número de 1 a 10.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (num == i) {
                System.out.println("Você acertou.");
            } else {
                System.out.println("Você errou.");


            }
        }
    }
}