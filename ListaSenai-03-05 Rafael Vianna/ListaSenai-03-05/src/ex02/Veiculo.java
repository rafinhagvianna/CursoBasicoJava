package ex02;

public abstract class Veiculo {
    protected String modelo;
    protected int ano;
    protected double distanciaPercorrida;

    public Veiculo(String modelo, int ano, double distanciaPercorrida) {
        this.modelo = modelo;
        this.ano = ano;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public abstract double calcularConsumo();

    public String getModelo() {
        return modelo;
    }
}
