import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa é uma calculadora, deseja continuar?");
        String continuar = sc.nextLine();
        while (continuar.equals("sim")) {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("soma, subtracao, multiplicacao ou divisao?");
            String operacao = sc.nextLine();
            if (operacao.equals("+") || operacao.equals("soma")) {
                System.out.println("Digite um valor: ");
                double valor = sc.nextDouble();
                System.out.println("Digite outro valor:");
                double valor2 = sc.nextDouble();
                double resultado = valor + valor2;
                System.out.println("Resultado: " + resultado);
            } else if (operacao.equals("-") || operacao.equals("subtracao")) {
                System.out.println("Digite um valor: ");
                double valor = sc.nextDouble();
                System.out.println("Digite outro valor:");
                double valor2 = sc.nextDouble();
                double resultado = valor - valor2;
                System.out.println("Resultado: " + resultado);
            } else if (operacao.equals("*") || operacao.equals("multiplicacao")) {
                System.out.println("Digite um valor: ");
                double valor = sc.nextDouble();
                System.out.println("Digite outro valor:");
                double valor2 = sc.nextDouble();
                double resultado = valor * valor2;
                System.out.println("Resultado: " + resultado);
            } else if (operacao.equals("/") || operacao.equals("divisao")) {
                System.out.println("Digite um valor: ");
                double valor = sc.nextDouble();
                System.out.println("Digite outro valor:");
                double valor2 = sc.nextDouble();
                double resultado = valor / valor2;
                System.out.println("Resultado: " + resultado);
            } else
                System.out.println("Informe uma operação válida.");


            System.out.println("deseja continuar?");
            continuar = sc.nextLine();

        }
        System.out.println("Calculadora encerrada.");
    }
}
