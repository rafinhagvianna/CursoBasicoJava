import java.util.ArrayList;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite nomes (digite 'fim' para parar):");

        while (true) {
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            nomes.add(nome);
        }

        System.out.println("\nLista de nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
