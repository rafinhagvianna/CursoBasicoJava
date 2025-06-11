package ex01;

class Pessoa implements Cloneable {
    private String nome;
    private int idade;
    private String endereco;
    private static int contador = 0;

    // Construtor
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        contador++;
    }
    public String getNome() {
        return nome;
    }


    // Método para comparar idades
    public static Pessoa maisVelho(Pessoa p1, Pessoa p2) {
        return (p1.idade > p2.idade) ? p1 : p2;
    }

    // Método para verificar se moram no mesmo endereço
    public boolean mesmoEndereco(Pessoa outraPessoa) {
        return this.endereco.equals(outraPessoa.endereco);
    }

    // Método para obter o número de instâncias criadas
    public static int getContador() {
        return contador;
    }

    // Método clone para cópia profunda
    @Override
    public Pessoa clone() {
        return new Pessoa(this.nome, this.idade, this.endereco);
    }

    // Método para imprimir informações
    public void imprimir() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Endereço: " + endereco);
    }
}

