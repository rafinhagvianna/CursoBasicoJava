package ex05;

import java.util.*;

class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;
    private List<String> historicoTransacoes;
    private boolean protecaoChequeEspecial;
    private double limiteChequeEspecial;

    public Conta(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historicoTransacoes = new ArrayList<>();
        this.protecaoChequeEspecial = false;
        this.limiteChequeEspecial = 0.0;
        adicionarTransacao("Conta criada com saldo inicial: R$" + saldoInicial);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean temProtecaoChequeEspecial() {
        return protecaoChequeEspecial;
    }

    public void ativarProtecaoChequeEspecial(double limite) {
        this.protecaoChequeEspecial = true;
        this.limiteChequeEspecial = limite;
        adicionarTransacao("Proteção de cheque especial ativada com limite de R$" + limite);
    }

    public void desativarProtecaoChequeEspecial() {
        this.protecaoChequeEspecial = false;
        this.limiteChequeEspecial = 0.0;
        adicionarTransacao("Proteção de cheque especial desativada");
    }

    private void adicionarTransacao(String transacao) {
        historicoTransacoes.add(transacao);
    }

    public void depositar(double valor) {
        saldo += valor;
        adicionarTransacao("Depósito de R$" + valor + ", novo saldo: R$" + saldo);
    }

    public boolean sacar(double valor) {
        if (saldo >= valor || (protecaoChequeEspecial && saldo + limiteChequeEspecial >= valor)) {
            saldo -= valor;
            adicionarTransacao("Saque de R$" + valor + ", novo saldo: R$" + saldo);
            return true;
        } else {
            adicionarTransacao("Tentativa de saque de R$" + valor + " falhou, saldo insuficiente");
            return false;
        }
    }

    public List<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }
}

class Banco {
    private Map<String, Conta> contas;

    public Banco() {
        this.contas = new HashMap<>();
    }

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumeroConta(), conta);
        System.out.println("Conta adicionada: " + conta.getNumeroConta());
    }

    public void removerConta(String numeroConta) {
        if (contas.containsKey(numeroConta)) {
            contas.remove(numeroConta);
            System.out.println("Conta removida: " + numeroConta);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public boolean transferir(String origem, String destino, double valor) {
        Conta contaOrigem = contas.get(origem);
        Conta contaDestino = contas.get(destino);

        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.sacar(valor)) {
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " realizada com sucesso de " + origem + " para " + destino);
                return true;
            } else {
                System.out.println("Transferência falhou devido a saldo insuficiente!");
                return false;
            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada!");
            return false;
        }
    }

    public void mostrarTop3Contas() {
        List<Conta> listaContas = new ArrayList<>(contas.values());
        listaContas.sort((c1, c2) -> Double.compare(c2.getSaldo(), c1.getSaldo()));

        System.out.println("As 3 contas com maior saldo:");
        for (int i = 0; i < Math.min(3, listaContas.size()); i++) {
            Conta conta = listaContas.get(i);
            System.out.println((i + 1) + ". " + conta.getTitular() + " - Saldo: R$" + conta.getSaldo());
        }
    }
}

