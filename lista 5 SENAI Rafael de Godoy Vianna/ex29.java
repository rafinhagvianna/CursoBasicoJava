import java.util.Arrays;
import java.util.Scanner;

public class ex29 {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocado;

        do {
            trocado = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocado = true;
                }
            }
        } while (trocado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        bubbleSort(vetor);

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

        scanner.close();
    }
}
