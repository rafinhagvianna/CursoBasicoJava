import java.util.Scanner;
import java.lang.Math;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcular a potência de um número.");
        System.out.println("Digite o valor da base.");
        double base = sc.nextDouble();
        System.out.println("Digite o valor do expoente.");
        double expoente = sc.nextDouble();
        double resultado = Math.pow(base, expoente);
        System.out.println("O resultado da potenciação é: " + String.format("%.2f", resultado) + ".");

    }
}
