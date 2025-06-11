import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa tranforma a tempertura em Celsius para para Fahrenheit, insira a temperatura em Celsius");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit de : " + fahrenheit + " ◦F ");
    }
}
