import java.util.Scanner;

public class Maincarro {
    public static void main(String[] args) {
        carro carro = new carro();
        System.out.println("Informe a marca, o modelo e o ano do carro.");
        Scanner sc = new Scanner(System.in);
        carro.marca = sc.nextLine();
        carro.modelo = sc.nextLine();
        carro.ano = sc.nextInt();

        carro.exibirDetalhes();

    }
}
