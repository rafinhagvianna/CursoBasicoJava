import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da altura do retângulo.");
        double altura = sc.nextDouble();
        System.out.println("Informe o valor da largura do retângulo.");
        double largura = sc.nextDouble();
        Retangulo retangulo = new Retangulo(altura, largura);
        System.out.println(retangulo.calcularArea());
    }
}
