// Exercício 1: Criar um vetor de inteiros e preencher com valores do usuário
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Vetor preenchido: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

