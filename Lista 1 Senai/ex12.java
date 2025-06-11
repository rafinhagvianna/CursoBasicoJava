import java.util.Scanner;
import java.lang.Math;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula o quadrado de qualquer número.\nDigite o número desejado.");
        double num = sc.nextDouble();
        System.out.println(Math.pow(num, 2));

    }
}
