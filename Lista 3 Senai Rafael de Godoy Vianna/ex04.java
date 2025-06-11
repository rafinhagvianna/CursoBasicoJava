import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para calcular o produto entre eles.");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double produto = n1 * n2;
        System.out.println("O produto resulta em " + String.format("%.2f", produto) + ".");
    }
}
