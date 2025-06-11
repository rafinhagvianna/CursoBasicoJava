import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        conta.titular = sc.nextLine();
        System.out.println("Digite o saldo do conta: ");
        conta.saldo = sc.nextDouble();
        System.out.println("Digite o valor incrementado do conta: ");
        double valor = sc.nextDouble();
        conta.saldo += valor;
        System.out.println(conta.toString());


    }
}
