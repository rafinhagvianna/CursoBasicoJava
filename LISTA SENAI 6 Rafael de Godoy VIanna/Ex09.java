// Exercício 9: Transpor uma matriz (trocar linhas por colunas)
public class Ex09 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String matrizString = "{1, 2, 3}\n{4, 5, 6}\n{7, 8, 9}";
        System.out.println(matrizString );
        int[][] transposta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }
        System.out.println("Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
