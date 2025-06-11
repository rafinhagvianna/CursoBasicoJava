import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados do livro: ");
        System.out.println("Titulo:");
        String titulo = sc.nextLine();
        System.out.println("Autor:");
        String autor = sc.nextLine();
        System.out.println("Ano :");
        int ano = sc.nextInt();
        Livro livro = new Livro(titulo, autor, ano);
        System.out.println(livro.exibirLivro());
    }
}
