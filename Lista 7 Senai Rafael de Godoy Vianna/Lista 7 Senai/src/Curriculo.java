public class Curriculo {
    String nome;
    int idade;
    String profissao;
    String experiencia;

    public String sobreMim() {
        return ("Olá, sou " + nome + ", tenho " + idade + ", trabalho como " + profissao + " e tenho experiencia com " + experiencia);
    }
}
