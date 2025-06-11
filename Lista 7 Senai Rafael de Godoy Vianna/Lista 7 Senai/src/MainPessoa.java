import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa();

        System.out.println("Digite seu nome, sua idade e sua altura.");
        Scanner sc = new Scanner(System.in);
        pessoa.nome = sc.nextLine();
        pessoa.idade = sc.nextInt();
        pessoa.altura = sc.nextDouble();

        pessoa.apresentacao();

    }
}
