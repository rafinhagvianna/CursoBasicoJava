package ex02;

public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, boolean temPartidaEletrica) {
        super(marca, modelo);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Possui Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
        System.out.println("------------------------------");
    }
}

