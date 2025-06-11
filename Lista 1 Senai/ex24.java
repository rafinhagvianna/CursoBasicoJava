import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor investido e a taxa de juros mensal(de 0 a 100 porcento) para calcular o rendimento após 1 mês");
        double valor = sc.nextDouble();
        double taxa = sc.nextDouble();
        double calcular = valor + (valor * taxa * 0.01);
        System.out.println("O investimento resultou em " + String.format("%.2f", calcular) + "R$ após 1 mês.");

    }
}
