import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois números para subtrair.");
        double n = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = n - n2;

        System.out.println("O resultado da subtração desses dois números é:" + "\n" + n3);
    }
}
