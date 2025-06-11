// Exercício 4: Ordenar um vetor de inteiros em ordem crescente
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 1, 2};
        String vetorString = " {5, 3, 8, 1, 2}";
        System.out.println(vetorString);
        Arrays.sort(vetor);
        System.out.println("Vetor ordenado em ordem crescente: " + Arrays.toString(vetor));
    }
}