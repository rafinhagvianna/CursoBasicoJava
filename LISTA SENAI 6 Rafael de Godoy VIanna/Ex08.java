// Exercício 8: Encontrar o maior elemento em uma matriz
public class Ex08 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String matrizString = "{1, 2, 3}\n{4, 5, 6}\n{7, 8, 9}";
        System.out.println(matrizString );
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Maior elemento da matriz: " + maior);
    }
}
