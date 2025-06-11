package ex01;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String tipoCombustivel;

    public Veiculo(String marca, String modelo, int ano, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularEficienciaCombustivel(double litros, double km) {
        return km / litros; // km por litro
    }

    public double calcularDistancia(double velocidadeMedia, double tempoHoras) {
        return velocidadeMedia * tempoHoras;
    }

    public double obterVelocidadeMaxima() {
        return 180.0; // Velocidade padrão, pode ser sobrescrita
    }

    public void agendarManutencao(String data) {
        System.out.println("Manutenção do " + modelo + " agendada para " + data + ".");
    }
}
