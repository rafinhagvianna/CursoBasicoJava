import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //F = (C * 9/5) + 32
        System.out.println("Este programa converte graus Celsius para Fahrenheit.");
        System.out.println("Insira a temperatura em Celsius");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura convertida para fahrenheit:\n"+ fahrenheit);

    }
}
