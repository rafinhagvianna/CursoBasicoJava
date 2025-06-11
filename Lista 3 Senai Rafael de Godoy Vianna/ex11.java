import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para calcular o resto");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double resto = n1 % n2 ;
        System.out.println("O resto da divisão é "+ String.format("%.2f", resto) + ".");
    }
}
