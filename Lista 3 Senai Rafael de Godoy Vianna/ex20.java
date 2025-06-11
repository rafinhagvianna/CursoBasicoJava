import java.util.Scanner;

public class ex20   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra para ser aplicado um imposto de 10%.");
        double valor = sc.nextDouble();
        double valorFinal = valor + (valor * 0.10);
        double imposto = valor * 0.10;
        System.out.println("Você foi taxado em :\n" + String.format("%.2f", imposto) + "reais\nE o valor final de sua compra ficou em:\n" + String.format("%.2f", valorFinal) + "reais");
    }
}
