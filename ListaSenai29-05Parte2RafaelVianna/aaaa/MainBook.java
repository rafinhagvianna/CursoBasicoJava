public class MainBook {
    public static void main(String[] args) {
        Book livro = new Book("Dom Casmurro", "Machado de Assis", 50.0, 300);

        livro.setGenre("Ficção");
        livro.applyDiscount(10);
        livro.applyMultipleDiscounts(5, 10);

        System.out.println(livro);
        System.out.println("Tempo estimado de leitura: " + livro.estimateReadingTime() + " minutos");
    }
}
