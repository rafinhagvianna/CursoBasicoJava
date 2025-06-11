public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;

    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;

    }

    public String exbirSaldo() {
        return "Titular: " + titular + "\n" + "Saldo : " + String.format("%.2f", this.saldo);

    }

}

