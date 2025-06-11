import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private final String nome;
    private final String tipoCulinaria;
    private final List<Prato> pratos;

    public Restaurante(String nome, String tipoCulinaria) {
        this.nome = nome;
        this.tipoCulinaria = tipoCulinaria;
        this.pratos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public List<Prato> getPratos() {
        return pratos;
    }
    public String toString() {
        return nome + " (" + tipoCulinaria + ")";
    }
}
