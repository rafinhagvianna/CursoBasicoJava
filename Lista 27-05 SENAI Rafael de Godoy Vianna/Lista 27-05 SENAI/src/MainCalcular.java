import java.util.Scanner;

public class MainCalcular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcular a área e a circuferência de um círculo.");
        System.out.println("Informe o valor do raio.");
        double raio = sc.nextDouble();
        System.out.println(Calcular.calcularCircunferencia(raio));
        System.out.println(Calcular.calcularVolume(raio));
        System.out.println("O valor de PI usado foi de " + Calcular.PI);
    }
}
