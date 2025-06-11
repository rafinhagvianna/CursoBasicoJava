import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = scanner.nextLine();

        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = scanner.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = scanner.nextDouble();

        funcionario.exibirDados();

        System.out.print("Digite a porcentagem de aumento do salário: ");
        double aumento = scanner.nextDouble();
        funcionario.aumentarSalario(aumento);

        funcionario.exibirDados();

    }
}