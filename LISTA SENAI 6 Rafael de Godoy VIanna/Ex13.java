// Exercício 13: Contar quantas vezes um número aparece em um vetor ou matriz
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o número a contar: ");
        int numero = scanner.nextInt();
        scanner.close();

        int contagem = 0;
        for (int[] linha : matriz) {
            for (int val : linha) {
                if (val == numero) contagem++;
            }
        }
        System.out.println("O número " + numero + " aparece " + contagem + " vezes.");
    }
}
