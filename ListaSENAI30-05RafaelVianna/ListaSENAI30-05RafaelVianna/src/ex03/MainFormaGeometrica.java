package ex03;
import java.util.Scanner;

public class MainFormaGeometrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        FormaGeometrica formaGeometrica = new FormaGeometrica();
        System.out.println("Informe a altura do retângulo:");
        retangulo.setAltura(sc.nextInt());
        System.out.println("Informe a largura do retângulo:");
        retangulo.setLargura(sc.nextInt());
        System.out.println("Informe o raio do círculo");
        circulo.setRaio(sc.nextInt());
        System.out.println(formaGeometrica.calcularArea(circulo.getRaio(), retangulo.getLargura(), retangulo.getAltura()));


    }
}
