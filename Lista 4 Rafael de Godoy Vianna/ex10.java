import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um limite para a sequência de Fibonacci: ");
        int limite = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        while (a <= limite) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}