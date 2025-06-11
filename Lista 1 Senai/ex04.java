import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número decimal que ele aparecerá simplificado como inteiro.");
        double n = sc.nextDouble();
        System.out.println((int) (n));

    }
}
