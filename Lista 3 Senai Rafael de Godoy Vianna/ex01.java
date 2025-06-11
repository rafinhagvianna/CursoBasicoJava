import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois números inteiros para somar.");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = num+num2;
        System.out.println("A soma resultou em : "+ soma);



    }
}
