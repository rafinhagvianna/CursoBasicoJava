// Exercício 18: Imprimir a matriz em formato tabular
public class Ex18 {
    public static void main(String[] args) {
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        for (int[] linha : matriz) {
            for (int val : linha) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
