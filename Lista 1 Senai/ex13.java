import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números, para calcular o resto da divisão entre eles");
        double n1 = sc.nextInt();
        double n2 = sc.nextInt();
        System.out.println("O resto da divisão vale: " + (n1 % n2));

    }
}
