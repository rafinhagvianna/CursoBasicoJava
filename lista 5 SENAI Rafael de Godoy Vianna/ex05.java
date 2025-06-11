import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra para saber se elea é consoante ou vogal.");
        char letra = sc.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o') {
            System.out.println("A letra inserida é uma vogal.");
        } else
            System.out.println("A letra inserida é uma consoante.");

    }
}