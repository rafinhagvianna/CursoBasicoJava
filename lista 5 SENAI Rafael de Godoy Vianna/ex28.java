import java.util.Scanner;

public class ex28 {
    private static char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    private static char jogadorAtual = 'X';

    public static void mostrarTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    public static boolean verificarVitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) return true;
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) return true;
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) return true;
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) return true;
        return false;
    }

    public static boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tabuleiro[i][j] == ' ') return false;
        return true;
    }

    public static void alternarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            mostrarTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", escolha sua jogada (linha e coluna): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                if (verificarVitoria()) {
                    mostrarTabuleiro();
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (tabuleiroCheio()) {
                    mostrarTabuleiro();
                    System.out.println("Empate!");
                    jogoAtivo = false;
                } else {
                    alternarJogador();
                }
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
