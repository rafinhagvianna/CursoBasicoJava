public class ContaBancaria {
    String titular;
    double saldo;

    public double atualizarSaldo(double valor) {
        return saldo += valor;


    }

    public String toString() {
        return "Titular:" + titular + "\nSaldo:" + saldo;
    }

}
