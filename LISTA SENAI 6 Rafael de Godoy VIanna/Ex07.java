// Exercício 7: Calcular a soma de todos os elementos de uma matriz
public class Ex07 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String matrizString = "{1, 2, 3}\n{4, 5, 6}\n{7, 8, 9}";
        System.out.println(matrizString );

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma dos elementos da matriz: " + soma);
    }
}
