import java.util.Scanner;

public class Gato {
    String nome;
    int idade;
    String raca;
    double peso;
    public Gato() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public boolean ehGatinho() {
        return this.idade < 1;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public static Gato compararIdade(Gato gato1, Gato gato2) {
        if (gato1.idade > gato2.idade) {
            return gato1;
        } else {
            return gato2;
        }
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raça: " + (this.raca != null ? this.raca : "Não definida"));
        System.out.println("Peso: " + this.peso + " kg");
    }


    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.setRaca("Siamês");
        gato1.setPeso(3.5);
        gato1.imprimirDetalhes();

        Gato gato2 = new Gato();
        gato2.setPeso(4.2);
        gato2.imprimirDetalhes();

        System.out.println("Gato mais velho:");
        Gato gatoMaisVelho = Gato.compararIdade(gato1, gato2);
        gatoMaisVelho.imprimirDetalhes();
    }
}
