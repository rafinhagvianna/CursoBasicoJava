// Exercício 12: Preencher uma matriz com números aleatórios entre 1 e 100
import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
