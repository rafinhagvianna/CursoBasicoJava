package ex02;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
        System.out.println("------------------------------");
    }
}
