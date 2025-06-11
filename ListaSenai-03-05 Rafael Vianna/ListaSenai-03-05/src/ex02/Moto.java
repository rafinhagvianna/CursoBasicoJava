package ex02;

public class Moto extends Veiculo {
    private static final double CONSUMO_MEDIO = 30.0;

    public Moto(String modelo, int ano, double distanciaPercorrida) {
        super(modelo, ano, distanciaPercorrida);
    }

    @Override
    public double calcularConsumo() {
        return distanciaPercorrida / CONSUMO_MEDIO;
    }
}
