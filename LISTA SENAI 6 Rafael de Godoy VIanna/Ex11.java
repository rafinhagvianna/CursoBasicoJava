import java.util.Scanner;

// Exercício 11: Verificar se uma matriz é simétrica
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + i + ", " + j + "]");
                matriz[i][j] = sc.nextInt();

            }
        }
        boolean simetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }
        System.out.println("A matriz é simétrica? " + simetrica);
    }
}

