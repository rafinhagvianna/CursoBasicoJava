import java.util.Scanner;

public class ex32 {
    public static boolean validarSenhaForte(String senha) {
        if (senha.length() < 8) return false; // Mínimo de 8 caracteres

        boolean temMaiuscula = false, temMinuscula = false, temDigito = false, temSimbolo = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temDigito = true;
            else temSimbolo = true; // Assume que caracteres não alfanuméricos são símbolos
        }

        return temMaiuscula && temMinuscula && temDigito && temSimbolo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (validarSenhaForte(senha)) {
            System.out.println("Senha forte!");
        } else {
            System.out.println("Senha fraca! Certifique-se de incluir letras maiúsculas, minúsculas, números e símbolos.");
        }

        scanner.close();
    }
}
