// Exercício 15: Verificar se uma matriz é diagonal
public class Ex15 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 0, 0},
                {0, 5, 0},
                {0, 0, 9}
        };
        boolean diagonal = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    diagonal = false;
                    break;
                }
            }
        }
        System.out.println("A matriz é diagonal? " + diagonal);
    }
}