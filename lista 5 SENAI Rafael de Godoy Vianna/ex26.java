import java.util.Scanner;

public class ex26 {
    public static boolean isPalindromo(String palavra) {
        palavra = palavra.toLowerCase().replaceAll("\\s+", ""); // Normaliza o texto
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (isPalindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("A palavra \"" + palavra + "\" NÃO é um palíndromo.");
        }

        scanner.close();
    }
}
