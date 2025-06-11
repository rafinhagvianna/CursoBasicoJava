public class Banco {
    private int numeroConta;
    private String titular;
    private double saldo;
    private String senha;

    public Banco() {

    }


    public String getNumeroConta() {
        return numeroConta + "";

    }

    public String getTitular() {
        return titular;

    }

    public String getSaldo() {
        return String.format("%.2f", saldo);

    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        } else
            System.out.println("Insira um valor válido");

    }

    public void saque(double valor) {
        if (valor <= (saldo - 3)) {
            saldo -= (valor + 3);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo após o saque: " + getSaldo() + " R$");
        } else if (valor > saldo - 3) {
            System.out.println("Não há valor suficiente para saque!");

        } else
            System.out.println("Insira um valor válido.");

    }

    public String exibirInformacoes() {
        return ("Numero Conta: " + getNumeroConta() + "\nTitular: " + getTitular() + "\nSaldo: " + getSaldo() + " R$ ");

    }

}
