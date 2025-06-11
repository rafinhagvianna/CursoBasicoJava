import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro. ");
        int num1 = sc.nextInt();
        System.out.println("Digite um numero decimal. ");
        double num2 = sc.nextDouble();
        System.out.println("Digite um caractere. ");
        char num3 = sc.next().charAt(0);
        System.out.println("Digite um varor boleano(true ou false). ");
        boolean num4 = sc.nextBoolean();
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);


    }
}
