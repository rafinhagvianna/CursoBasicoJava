import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Informe o seu nome:");
        aluno.nome = sc.nextLine();
        System.out.println("Informe a sua primeira nota:");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Informe a sua segunda nota:");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Informe a sua terceira nota:");
        aluno.nota3 = sc.nextDouble();
        double media = ((aluno.nota1 + aluno.nota2 + aluno.nota3) / 3);
        if (media >= 6) {
            System.out.println("Olá, " + aluno.nome + " você foi aprovado com média: " + String.format("%.2f",media));

        } else
            System.out.printf("Olá, " + aluno.nome + " você foi reprovado com média: " + String.format("%.2f",media) + " faltam " + String.format("%.2f", 6 - media) + " pontos para você ser aprovado");
    }

}
