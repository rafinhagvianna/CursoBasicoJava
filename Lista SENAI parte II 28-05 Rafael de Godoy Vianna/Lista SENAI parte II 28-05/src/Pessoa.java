import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String pais;
    private List<String> historicoNacionalidade;

    public Pessoa(String nome, int idade, String pais) {
        setNome(nome);
        this.idade = idade;
        this.pais = pais;
        this.historicoNacionalidade = new ArrayList<>();
        this.historicoNacionalidade.add(pais);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String novoPais) {
        if (!this.pais.equals(novoPais)) {
            this.historicoNacionalidade.add(novoPais);
        }
        this.pais = novoPais;
    }

    public boolean validarIdade() {
        return idade >= 18;
    }

    public String exibirNomeMaiusculas() {
        return nome.toUpperCase();
    }

    public List<String> getHistoricoNacionalidade() {
        return historicoNacionalidade;
    }

    public String exibirDados() {
        return "Nome: " + exibirNomeMaiusculas() +
                "\nIdade: " + idade +
                "\nNacionalidade atual: " + pais +
                "\nHistórico de nacionalidades: " + historicoNacionalidade;
    }
}

