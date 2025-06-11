// Exercício 20: Transformar uma matriz em um vetor linha por linha
public class Ex20 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] vetor = new int[matriz.length * matriz[0].length];
        int index = 0;
        for (int[] linha : matriz) {
            for (int val : linha) {
                vetor[index++] = val;
            }
        }
        System.out.print("Vetor: ");
        for (int v : vetor) {
            System.out.print(v + " ");
        }
    }
}