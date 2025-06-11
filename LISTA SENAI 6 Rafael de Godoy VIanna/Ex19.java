// Exercício 19: Contar elementos pares e ímpares em um vetor ou matriz
public class Ex19 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int pares = 0, impares = 0;
        for (int[] linha : matriz) {
            for (int val : linha) {
                if (val % 2 == 0) pares++;
                else impares++;
            }
        }
        System.out.println("Pares: " + pares + ", Ímpares: " + impares);
    }
}
