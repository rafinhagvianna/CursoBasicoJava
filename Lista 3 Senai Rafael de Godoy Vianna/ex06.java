import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele está entre 10 e 20.");
        double n = sc.nextDouble();
        if (n >= 10 && n <= 20) {
            System.out.println("O número está entre 10 e 20.");
        } else
            System.out.println("O número não esta entre 10 e 20.");


    }
}

