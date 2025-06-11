import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de uma compra e o número de parcelas para calcular o valor de cada parcela");
        double valor = sc.nextDouble();
        double numeroParcelas = sc.nextDouble();
        double valorParcela = valor/ numeroParcelas;
        System.out.println("O valor de cada parcela é de " + String.format("%.2f", valorParcela) + "R$");


    }
}
