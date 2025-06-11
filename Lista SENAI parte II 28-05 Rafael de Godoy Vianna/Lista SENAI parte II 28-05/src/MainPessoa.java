import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira a sua nacionalidade: ");
        String pais = sc.nextLine();


        Pessoa pessoa = new Pessoa(nome, idade, pais);


        System.out.println("\nDados da Pessoa:");
        System.out.println(pessoa.exibirDados());

        if (pessoa.validarIdade()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        System.out.print("\nDeseja mudar de nacionalidade? (sim/nao): ");
        String resposta = sc.nextLine().trim().toLowerCase();

        while (resposta.equals("sim")) {
            System.out.print("Informe sua nova nacionalidade: ");
            String novaNacionalidade = sc.nextLine();
            pessoa.setPais(novaNacionalidade);

            System.out.println("Atualização feita! Você agora é " + pessoa.getPais());
            System.out.println("Histórico de nacionalidades: " + pessoa.getHistoricoNacionalidade());

            System.out.print("\nDeseja mudar de novo? (sim/nao): ");
            resposta = sc.nextLine().trim().toLowerCase();
        }

        System.out.println("\nEncerrando programa...");
        sc.close();
    }
}
