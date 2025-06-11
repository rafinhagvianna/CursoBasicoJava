import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        System.out.println("Informe o valor da base e da altura de qualquer triângulo.");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        System.out.println("O valor da área do triângulo é de "+ ((base * altura)/2) + "m²");

    }
}
