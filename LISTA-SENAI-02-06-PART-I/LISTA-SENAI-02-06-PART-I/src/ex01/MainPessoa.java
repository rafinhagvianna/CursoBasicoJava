package ex01;

public class MainPessoa {
    public static void main(String[] args) {
        // Criando duas instâncias de Pessoa
        Pessoa pessoa1 = new Pessoa("Alice", 30, "Rua A, 123");
        Pessoa pessoa2 = new Pessoa("Bob", 25, "Rua B, 456");

        // Imprimindo informações
        pessoa1.imprimir();
        pessoa2.imprimir();

        // Comparando idades
        Pessoa maisVelho = Pessoa.maisVelho(pessoa1, pessoa2);
        System.out.println("Pessoa mais velha: " + maisVelho.getNome());

        // Verificando se moram no mesmo endereço
        System.out.println("Moram no mesmo endereço? " + pessoa1.mesmoEndereco(pessoa2));

        // Mostrando o contador de instâncias criadas
        System.out.println("Número de pessoas criadas: " + Pessoa.getContador());

        // Testando o método clone
        Pessoa clonePessoa1 = pessoa1.clone();
        clonePessoa1.imprimir();
    }
}
