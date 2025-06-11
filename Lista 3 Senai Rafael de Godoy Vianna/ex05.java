import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se ele é positivo, negativo ou nulo.");
        double num = sc.nextDouble();

        if (num == 0) {
            System.out.println("O número é nulo");
        } else if (num > 0) {
            System.out.println("O número é positivo");
        } else
            System.out.println("O número é negativo");

    }
}


