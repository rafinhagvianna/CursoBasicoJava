import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula a operação que você quiser, entre soma, subtração, multiplicação e divisão");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        System.out.println("Digite uma opção");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o primeiro valor: ");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            int num2 = sc.nextInt();
            System.out.printf("O resultado da soma é: " + (num1 + num2));

        } else if (opcao == 2) {
            System.out.println("Digite o primeiro valor: ");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            int num2 = sc.nextInt();
            System.out.println("O resultado da subtração é: " + (num1 - num2));
        } else if (opcao == 3) {
            System.out.println("Digite o primeiro valor: ");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            int num2 = sc.nextInt();
            System.out.println("O resultado da multiplicação é: " + (num1 * num2));
        } else if (opcao == 4) {
            System.out.println("Digite o primeiro valor: ");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            int num2 = sc.nextInt();
            System.out.println("O resultado da divisão é: " + (num1 / num2));
        }


    }

}

