package ex02;

public class Funcionario {
    private String nome;
    private String endereco;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String endereco, double salario, String cargo) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void gerarRelatorioDesempenho() {
        System.out.println("Relatório de desempenho para " + nome + " (" + cargo + ")");
    }

    public void gerenciarProjetos() {
        System.out.println(nome + " está gerenciando projetos.");
    }

    public void programaMentoria() {
        System.out.println(nome + " está participando do programa de mentoria para novas contratações.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
    }
}
