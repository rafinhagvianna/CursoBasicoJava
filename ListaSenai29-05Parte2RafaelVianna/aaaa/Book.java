import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Book {
    private String title;
    private String author;
    private double price;
    private String genre;
    private int pageCount;

    private static final Set<String> VALID_GENRES = new HashSet<>(Arrays.asList(
            "Ficção", "Não-Ficção", "Fantasia", "Romance", "Mistério", "Biografia", "Tecnologia"
    ));

    public Book(String title, String author, double price, int pageCount) {
        this.title = title;
        this.author = author;
        setPrice(price); // Usa o setter para validar
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Erro: O preço não pode ser negativo.");
        } else {
            this.price = price;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 0) {
            System.out.println("Erro: Número de páginas inválido.");
        } else {
            this.pageCount = pageCount;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (VALID_GENRES.contains(genre)) {
            this.genre = genre;
        } else {
            System.out.println("Gênero inválido. Gêneros válidos são: " + VALID_GENRES);
        }
    }

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Desconto inválido.");
            return;
        }
        double discountAmount = price * (percent / 100);
        price -= discountAmount;
    }

    public void applyMultipleDiscounts(double... discounts) {
        for (double d : discounts) {
            applyDiscount(d); // reaproveita método anterior
        }
    }

    public int estimateReadingTime() {
        return pageCount;
    }

    public String toString() {
        return String.format("Livro: %s | Autor: %s | Preço: R$%.2f | Gênero: %s | Páginas: %d",
                title, author, price, genre != null ? genre : "N/A", pageCount);
    }
}
