// Exercício 14: Preencher uma matriz com zeros e uns formando uma máscara binária
public class Ex14 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i == j || i + j == matriz.length - 1) ? 1 : 0;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

