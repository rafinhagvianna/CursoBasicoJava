package ex02;

public class Developer extends Funcionario {
    private int projetosConcluidos;
    private int prazosPendentes;
    private String nome;

    public Developer(String nome, String endereco, double salario) {
        super(nome, endereco, salario, "Developer");
        this.projetosConcluidos = 0;
        this.prazosPendentes = 0;
    }

    public void concluirProjeto() {
        projetosConcluidos++;
        System.out.println(nome + " concluiu um projeto.");
    }

    public void adicionarPrazoPendente() {
        prazosPendentes++;
        System.out.println("Novo prazo pendente adicionado para " + nome + ".");
    }

    public void monitorarProjetos() {
        System.out.println(nome + " possui " + projetosConcluidos + " projetos concluídos e " +
                prazosPendentes + " prazos pendentes.");
    }
}

