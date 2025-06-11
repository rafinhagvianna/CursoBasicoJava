import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        produto produto = new produto();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.println("Digite o valor da produto: ");
        produto.preco = sc.nextDouble();



        System.out.println(produto.toString());

    }
}
