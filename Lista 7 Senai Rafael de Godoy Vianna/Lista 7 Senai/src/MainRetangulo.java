import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do retangulo: ");
        retangulo.altura = sc.nextInt();
        System.out.println("Digite a largura do retangulo: ");
        retangulo.largura = sc.nextInt();

        System.out.println("A área do retângulo é: ");
        System.out.println((retangulo.area()));
        System.out.println("O perímetro do retângulo é: ");
        System.out.println((retangulo.perimetro()));

    }
}
