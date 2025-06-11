import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Ex10 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Matriz 1:");
        String matrizString1 = "{1, 2}\n{3, 4}";
        System.out.println(matrizString1 );

        int[][] B = {
                {5, 6},
                {7, 8}
        };
        System.out.println("Matriz 2:");
        String matrizString2 = "{5, 6}\n{7, 8}";
        System.out.println(matrizString2 );

        int[][] resultado = multiplicaMatrizes(A, B);

        System.out.println("Matriz resultado:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicaMatrizes(int[][] A, int[][] B) {
        int[][] resultado = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return resultado;
    }
}