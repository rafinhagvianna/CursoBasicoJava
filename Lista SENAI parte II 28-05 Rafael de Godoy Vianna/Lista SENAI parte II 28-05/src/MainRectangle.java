import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o comprimento do retângulo: ");
        double comprimento = sc.nextDouble();

        System.out.print("Insira a largura do retângulo: ");
        double largura = sc.nextDouble();

        Rectangle retangulo;
        try {
            retangulo = new Rectangle(comprimento, largura);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            sc.close();
            return;
        }

        System.out.println("\nInformações do Retângulo:");
        retangulo.exibirDados();

        System.out.print("\nDeseja redimensionar o retângulo? (sim/nao): ");
        sc.nextLine();
        String resposta = sc.nextLine().trim().toLowerCase();

        if (resposta.equals("sim")) {
            System.out.print("Insira o fator de redimensionamento (ex: 1.5 aumenta 50%): ");
            double fator = sc.nextDouble();

            try {
                retangulo.redimensionar(fator);
                System.out.println("\nApós redimensionamento:");
                retangulo.exibirDados();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("\nPrograma encerrado.");
        sc.close();
    }
}
