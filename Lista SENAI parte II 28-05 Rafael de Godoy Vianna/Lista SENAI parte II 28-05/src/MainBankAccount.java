import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o saldo inicial: R$");
        double saldoInicial = sc.nextDouble();
        BankAccount conta = new BankAccount(saldoInicial);
        System.out.println("Conta criada! Número da conta: " + conta.getAccountNumber());

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$" + conta.getBalance());
                    break;
                case 2:
                    System.out.print("Insira o valor do depósito: R$");
                    double deposito = sc.nextDouble();
                    conta.deposit(deposito);
                    break;
                case 3:
                    System.out.print("Insira o valor do saque: R$");
                    double saque = sc.nextDouble();
                    try {
                        conta.withdraw(saque);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Até mais, obrigado por utilizar nosso sistema!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        }
    }
}
