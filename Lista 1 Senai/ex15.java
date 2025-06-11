import java.util.Scanner;
import java.lang.Math;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcular o seu IMC, insira o seu peso em quilos e a sua altura em metros");
        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        System.out.println("O seu IMC é: " + imc);

    }
}
