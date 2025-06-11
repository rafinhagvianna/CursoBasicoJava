package ex01;

public class Motocicleta extends Veiculo {
    public Motocicleta(String marca, String modelo, int ano, String tipoCombustivel) {
        super(marca, modelo, ano, tipoCombustivel);
    }

    public void verificarPressaoPneus() {
        System.out.println("Pressão dos pneus verificada. Tudo OK para a viagem!");
    }

    @Override
    public double obterVelocidadeMaxima() {
        return 220.0;
    }
}

