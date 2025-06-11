import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro dígito");
        int a = sc.nextInt();
        System.out.println("Informe o segundo dígito");
        int b = sc.nextInt();
        System.out.println("Qual operação você deseja realizar??");
        sc.nextLine();
        String operacao = sc.nextLine();
        if (operacao.equals("+") || operacao.equals("soma")) {
            System.out.println(Calculadora.soma(a, b));
        } else if (operacao.equals("-") || operacao.equals("subtracao")) {
            System.out.println(Calculadora.subtracao(a, b));
        } else if (operacao.equals("*") || operacao.equals("multiplicacao")) {
            System.out.println(Calculadora.multiplicacao(a, b));
        } else if (operacao.equals("/") || operacao.equals("divisao")) {
            if (b == 0) {
                 return;
            } else
                System.out.println(Calculadora.divisao(a, b));
        }
    }
}
