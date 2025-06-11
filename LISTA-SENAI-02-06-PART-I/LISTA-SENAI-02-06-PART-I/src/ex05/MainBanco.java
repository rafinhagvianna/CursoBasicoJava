package ex05;

public class MainBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta conta1 = new Conta("001", "Alice", 5000);
        Conta conta2 = new Conta("002", "Bob", 3000);
        Conta conta3 = new Conta("003", "Carlos", 7000);
        Conta conta4 = new Conta("004", "Daniel", 1500);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);
        banco.adicionarConta(conta4);

        conta1.depositar(2000);
        conta2.sacar(500);
        banco.transferir("001", "002", 1000);

        conta2.ativarProtecaoChequeEspecial(1000);
        conta2.sacar(4000); // Testando saque com cheque especial

        System.out.println("Histórico de Alice:");
        for (String transacao : conta1.getHistoricoTransacoes()) {
            System.out.println(transacao);
        }

        banco.removerConta("004");

        banco.mostrarTop3Contas();
    }
}
