import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu Calculadora =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da soma: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado da subtração: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado da multiplicação: " + (num1 * num2));
                        break;
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
