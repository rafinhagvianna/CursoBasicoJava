import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula a base de um retângulo.");
        System.out.println("Informe a largura e a altura");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();
        double area = largura * altura;
        System.out.println("O area vale : " + String.format("%.2f", area)+ "m².");


    }
}
