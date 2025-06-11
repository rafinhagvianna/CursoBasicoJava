package ex03;

public class Circulo {
    private double PI = 3.14;
    private int raio;

    public Circulo() {

    }

    public Circulo(double PI, int raio) {
        this.PI = PI;
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * raio * raio;
    }
}
