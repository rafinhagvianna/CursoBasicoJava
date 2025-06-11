import java.util.Scanner;

public class ex30 {
    public static int calcularSomaDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = calcularSomaDigitos(numero);
        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);

        scanner.close();
    }
}

