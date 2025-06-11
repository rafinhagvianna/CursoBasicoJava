public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;

    }

    public String exibirAluno() {
        return "O aluno " + nome + " tem " + idade + " anos" + " e cursa " + curso;
    }
}