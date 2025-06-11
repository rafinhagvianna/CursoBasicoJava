public class MainLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 59.90);

        livro1.imprimirInfo();
        livro2.imprimirInfo();
        livro3.imprimirInfo();

        livro3.aplicarDesconto(10);
        livro3.definirBestSeller(true);
        livro3.setResenhas(new double[]{5.0, 4.5, 5.0, 4.0});

        System.out.println("Livro 3 é mais caro que Livro 2? " + livro3.temPrecoMaiorQue(livro2));
        System.out.println();

        livro3.imprimirInfo();
    }
}
