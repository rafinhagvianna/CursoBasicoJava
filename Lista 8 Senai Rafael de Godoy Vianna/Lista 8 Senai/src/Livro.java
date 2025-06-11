public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private boolean bestSeller;
    private double[] resenhas;

    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.preco = 0.0;
        this.bestSeller = false;
        this.resenhas = new double[0];
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
        this.bestSeller = false;
        this.resenhas = new double[0];
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.bestSeller = false;
        this.resenhas = new double[0];
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            this.preco -= this.preco * (percentual / 100);
        }
    }

    public boolean temPrecoMaiorQue(Livro outro) {
        return this.preco > outro.preco;
    }

    public void definirBestSeller(boolean status) {
        this.bestSeller = status;
    }

    public boolean isBestSeller() {
        return this.bestSeller;
    }

    public void setResenhas(double[] resenhas) {
        this.resenhas = resenhas;
    }

    public double calcularClassificacao() {
        if (resenhas.length == 0) return 0;
        double soma = 0;
        for (double r : resenhas) {
            soma += r;
        }
        return soma / resenhas.length;
    }

    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Best-seller: " + (bestSeller ? "Sim" : "Não"));
        System.out.printf("Classificação média: %.2f\n", calcularClassificacao());
        System.out.println("---------------------------");
    }
}
