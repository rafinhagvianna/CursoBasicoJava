import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe a idade do aluno: ");
        int idade = sc.nextInt();
        System.out.println("Informe o curso do aluno: ");
        sc.nextLine();
        String curso = sc.nextLine();




        Aluno aluno = new Aluno(nome, idade, curso);
        System.out.println(aluno.exibirAluno());
    }
}
