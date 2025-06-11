import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o dobro");
        int num1 = sc.nextInt();
        System.out.println("O resultado é esse: "+ calcular(num1));


    }
    public static double calcular(double num1) {

        return num1 * 2;

    }
}

