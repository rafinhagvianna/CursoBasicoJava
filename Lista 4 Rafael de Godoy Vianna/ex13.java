import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula a tabuada(de 1 a 10) de qualquer número inteiro, insira o número desejado");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ": " + n + " x " + i + " = " + (n * i));



        }
    }
}
