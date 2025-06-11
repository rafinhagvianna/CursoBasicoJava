// Exercício 3: Calcular a média dos elementos de um vetor
public class Ex03 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        String vetorString = "{10, 20, 30, 40, 50}";
        System.out.println(vetorString);
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        double media = (double) soma / vetor.length;
        System.out.println("Média: " + media);
    }
}

