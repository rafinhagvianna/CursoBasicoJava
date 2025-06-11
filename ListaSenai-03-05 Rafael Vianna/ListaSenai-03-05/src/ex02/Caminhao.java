package ex02;

public class Caminhao extends Veiculo {
    private static final double CONSUMO_BASE = 8.0;
    private double toneladasTransportadas;

    public Caminhao(String modelo, int ano, double distanciaPercorrida, double toneladasTransportadas) {
        super(modelo, ano, distanciaPercorrida);
        this.toneladasTransportadas = toneladasTransportadas;
    }

    @Override
    public double calcularConsumo() {
        double consumoPorKm = CONSUMO_BASE - (toneladasTransportadas * 0.5);
        return distanciaPercorrida / consumoPorKm;
    }
}
