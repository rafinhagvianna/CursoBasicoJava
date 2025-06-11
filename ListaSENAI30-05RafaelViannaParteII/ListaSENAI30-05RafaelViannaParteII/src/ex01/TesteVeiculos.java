package ex01;

public class TesteVeiculos {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, "Diesel", 25.0);
        Carro carro = new Carro("Toyota", "Corolla", 2022, "Gasolina");
        Motocicleta moto = new Motocicleta("Honda", "CB500", 2023, "Gasolina");

        System.out.println("== Caminhão ==");
        caminhao.verificarCarga(20);
        caminhao.agendarManutencao("10/06/2025");
        System.out.println("Velocidade máxima: " + caminhao.obterVelocidadeMaxima() + " km/h");
        System.out.println();

        System.out.println("== Carro ==");
        double tempoViagem = carro.estimarTempoViagem(600, 100);
        System.out.println("Tempo estimado para 600 km: " + tempoViagem + " horas");
        carro.agendarManutencao("12/06/2025");
        System.out.println("Velocidade máxima: " + carro.obterVelocidadeMaxima() + " km/h");
        System.out.println();

        System.out.println("== Motocicleta ==");
        moto.verificarPressaoPneus();
        moto.agendarManutencao("15/06/2025");
        System.out.println("Velocidade máxima: " + moto.obterVelocidadeMaxima() + " km/h");
    }
}
