package ex04;


import java.util.ArrayList;
import java.util.List;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int anosServico;
    private static Funcionario maisBemPago = null;
    private static List<Funcionario> funcionarios = new ArrayList<>();


    public Funcionario(String nome, String cargo, double salario, int anosServico) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.anosServico = anosServico;
        funcionarios.add(this);
        atualizarMaisBemPago();
    }

    public String getNome() {
        return nome;
    }

    private void atualizarMaisBemPago() {
        if (!funcionarios.isEmpty()) {
            Funcionario maiorSalario = funcionarios.get(0);
            for (Funcionario f : funcionarios) {
                if (f.salario > maiorSalario.salario) {
                    maiorSalario = f;
                }
            }
            maisBemPago = maiorSalario;
        }
    }

    public static Funcionario getMaisBemPago() {
        return maisBemPago;
    }

    public double calcularBonus() {
        return salario * (0.05 * anosServico); // 5% do salário por ano de serviço
    }

    public void atualizarSalario(double novoSalario) {
        if (anosServico >= 1) {
            this.salario = novoSalario;
            atualizarMaisBemPago();
        } else {
            System.out.println("Erro: Apenas funcionários com mais de um ano de experiência podem ter aumento salarial.");
        }
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario + ", Anos de Serviço: " + anosServico);
    }
}

final class FuncionarioImutavel {
    private final String nome;
    private final String cargo;
    private final double salario;
    private final int anosServico;

    public FuncionarioImutavel(String nome, String cargo, double salario, int anosServico) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.anosServico = anosServico;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnosServico() {
        return anosServico;
    }

    public double calcularBonus() {
        return salario * (0.05 * anosServico);
    }

    public void imprimir() {
        System.out.println("Funcionário Imutável - Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario + ", Anos de Serviço: " + anosServico);
    }
}


