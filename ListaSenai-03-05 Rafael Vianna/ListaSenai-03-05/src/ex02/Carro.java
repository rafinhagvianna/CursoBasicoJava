package ex02;

public class Carro extends Veiculo {
    private static final double CONSUMO_MEDIO = 15.0;

    public Carro(String modelo, int ano, double distanciaPercorrida) {
        super(modelo, ano, distanciaPercorrida);
    }

    @Override
    public double calcularConsumo() {
        return distanciaPercorrida / CONSUMO_MEDIO;
    }
}
