// Exercício 2: Encontrar o maior e o menor elemento de um vetor
public class Ex02 {
    public static void main(String[] args) {
        int[] vetor = {4, 2, 9, 11, 5, 7};
        String vetorString = "{4,2,9,11,5,7}";
        System.out.println(vetorString);
        int maior = vetor[0], menor = vetor[0];
        for (int num : vetor) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior: " + maior + ", Menor: " + menor);
    }
}

