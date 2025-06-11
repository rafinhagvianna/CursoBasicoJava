import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro de 1 a 10 para calcular a tabuada ");
        int num1 = sc.nextInt();
        if (num1<1 || num1>10) {
            System.out.println("Insira um número válido.");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num1 + " = " + num1*i);
            }



        }
    }

