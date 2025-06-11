public class Celular {
    private String marca;
    private String modelo;
    private double preco;
    public Celular(String marca) {
        this.marca = marca;
        this.modelo = "X";
        this.preco = 0.0;
    }
    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Celular(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    public String exibirCelular() {
        return ("O celular é da marca " + this.marca + ", sendo do modelo " + this.modelo + " e tem preço fixo de " + this.preco + " reais.");

    }

}
