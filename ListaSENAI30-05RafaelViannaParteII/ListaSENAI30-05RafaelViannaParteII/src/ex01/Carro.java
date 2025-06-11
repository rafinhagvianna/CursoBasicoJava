package ex01;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano, String tipoCombustivel) {
        super(marca, modelo, ano, tipoCombustivel);
    }

    public double estimarTempoViagem(double distancia, double velocidadeMedia) {
        return distancia / velocidadeMedia; // Tempo em horas
    }

    @Override
    public double obterVelocidadeMaxima() {
        return 200.0;
    }
}

