// Exercício 17: Soma dos elementos da diagonal principal de uma matriz NxN
public class Ex17 {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 1, 3},
                {2, 6, 4},
                {7, 8, 9}
        };
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + soma);
    }
}
