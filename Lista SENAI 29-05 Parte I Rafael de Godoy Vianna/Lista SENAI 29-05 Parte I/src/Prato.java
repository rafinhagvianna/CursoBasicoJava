public class Prato {
    private final String nome;
    private final double preco;
    private final TipoPrato tipo;


    public Prato(String nome, double preco, TipoPrato tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public TipoPrato getTipo() {
        return tipo;
    }

    public String toString() {
        return nome + " - R$" + preco + " (" + tipo + ")";
    }
}
