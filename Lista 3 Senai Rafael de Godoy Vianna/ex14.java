import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do produto que será descontado 15%. ");
        double produto = sc.nextDouble();
        double valor = produto - (produto * 0.15);
        double desconto = produto * 0.15;
        System.out.println("Foi descontado do produto:\n" + String.format("%.2f", desconto) + " reais.\nE o valor final é de:\n" + String.format("%.2f", valor) + " reais.");

    }
}
