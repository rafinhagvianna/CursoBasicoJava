import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do titular: ");
        String titular = sc.nextLine();
        System.out.println("Insira o saldo da conta: ");
        double saldo = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(titular, saldo);
        System.out.println(conta.exbirSaldo());

    }
}
