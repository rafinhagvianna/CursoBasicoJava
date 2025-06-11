import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Restaurante> restaurantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Adicionar prato a restaurante");
            System.out.println("3. Listar pratos de um restaurante");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> cadastrarRestaurante();
                case 2 -> adicionarPrato();
                case 3 -> listarPratos();
                case 0 -> System.out.println("Obrigado por utilizar nosso sistema!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarRestaurante() {
        System.out.print("Nome do restaurante: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo de culinária: ");
        String tipo = scanner.nextLine();

        restaurantes.add(new Restaurante(nome, tipo));
        System.out.println("Restaurante cadastrado com sucesso!");
    }

    private static void adicionarPrato() {
        Restaurante restaurante = selecionarRestaurante();
        if (restaurante == null) return;

        System.out.print("Nome do prato: ");
        String nome = scanner.nextLine();
        System.out.print("Preço do prato: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.println("Tipo do prato (1 - ENTRADA, 2 - PRINCIPAL, 3 - SOBREMESA): ");
        int tipo = Integer.parseInt(scanner.nextLine());

        TipoPrato tipoPrato = null;

        switch (tipo) {
            case 1 -> tipoPrato = TipoPrato.ENTRADA;
            case 2 -> tipoPrato = TipoPrato.PRINCIPAL;
            case 3 -> tipoPrato = TipoPrato.SOBREMESA;
            default -> {
                System.out.println("Tipo inválido.");
                return;
            }
        }
        restaurante.adicionarPrato(new Prato(nome, preco, tipoPrato));
        System.out.println("Prato adicionado com sucesso!");
    }

    private static void listarPratos() {
        Restaurante restaurante = selecionarRestaurante();
        if (restaurante == null) return;

        System.out.println("\nPratos do restaurante " + restaurante.getNome() + ":");
        for (Prato prato : restaurante.getPratos()) {
            System.out.println("- " + prato);
        }
    }

    private static Restaurante selecionarRestaurante() {
        if (restaurantes.isEmpty()) {
            System.out.println("Nenhum restaurante cadastrado.");
            return null;
        }

        System.out.println("Selecione um restaurante:");
        for (int i = 0; i < restaurantes.size(); i++) {
            System.out.println((i + 1) + ". " + restaurantes.get(i));
        }

        int escolha = Integer.parseInt(scanner.nextLine()) - 1;
        if (escolha < 0 || escolha >= restaurantes.size()) {
            System.out.println("Restaurante inválido.");
            return null;
        }

        return restaurantes.get(escolha);
    }
}
