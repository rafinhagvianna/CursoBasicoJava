package ex02;

public class MainVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CG 160", true);

        carro.exibirDados();
        moto.exibirDados();
    }
}
