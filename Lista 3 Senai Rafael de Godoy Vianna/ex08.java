import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para verificar se eles são iguais ou diferentes.");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else
            System.out.println("Os números são diferentes.");

    }
}
