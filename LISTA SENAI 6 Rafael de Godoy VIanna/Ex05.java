// Exercício 5: Remover elementos duplicados de um vetor
import java.util.HashSet;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 2, 3, 4, 4, 5};
        String vetorString = "{1, 2, 2, 3, 4, 4, 5}";
        System.out.println(vetorString);
        Set<Integer> set = new HashSet<>();
        for (int num : vetor) {
            set.add(num);
        }
        System.out.println("Vetor sem duplicatas: " + set);
    }
}

