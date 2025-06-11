package ex01;

public class Caminhao extends Veiculo {
    private double capacidadeMaximaCarga; // em toneladas

    public Caminhao(String marca, String modelo, int ano, String tipoCombustivel, double capacidadeMaximaCarga) {
        super(marca, modelo, ano, tipoCombustivel);
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    public boolean verificarCarga(double pesoCarga) {
        if (pesoCarga <= capacidadeMaximaCarga) {
            System.out.println("Carga dentro do limite.");
            return true;
        } else {
            System.out.println("Carga excede o limite!");
            return false;
        }
    }

    @Override
    public double obterVelocidadeMaxima() {
        return 120.0;
    }
}

