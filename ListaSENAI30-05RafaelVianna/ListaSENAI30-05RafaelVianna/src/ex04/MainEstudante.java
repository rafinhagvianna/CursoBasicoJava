package ex04;

import java.util.Scanner;

public class MainEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Estudante estudante = new Estudante();
        System.out.println("Digite o nome do estudante: ");
        pessoa.setNome(sc.nextLine());
        System.out.println("Digite a idade do estudante");
        pessoa.setIdade(sc.nextInt());
        estudante.setNome(pessoa.getNome());
        estudante.setIdade(pessoa.getIdade());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getNome());

    }
}
