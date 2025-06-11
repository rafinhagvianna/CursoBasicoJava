import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe três números para calcular a média.");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double media = (num1 + num2 + num3) / 3;

        System.out.println("A média entre os números é:\n" + media);

    }
}
