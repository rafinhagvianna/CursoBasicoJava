public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.anoPublicacao = 0;
        this.autor = "Rafuleko.";
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }
    public String exibirLivro(){

        return (this.titulo + "\n" + this.autor + "\n" + this.anoPublicacao);
    }
}
