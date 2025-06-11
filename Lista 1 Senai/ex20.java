import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em real que queira converter para dólar.");
        double real = sc.nextDouble();
        double dolar = real * 5.67;
        System.out.println("A conversão resultou em " + dolar + "US$");


    }
}
