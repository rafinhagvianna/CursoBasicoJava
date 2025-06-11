package ex02;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Honda Civic", 2020, 3000));
        veiculos.add(new Moto("Yamaha XJ6", 2018, 4000));
        veiculos.add(new Caminhao("Scania R450", 2022, 5000, 5));

        double totalCombustivel = 0;

        System.out.println("Consumo de combustível:");
        for (Veiculo veiculo : veiculos) {
            double consumo = veiculo.calcularConsumo();
            totalCombustivel += consumo;
            System.out.println(veiculo.getModelo() + " - " + String.format("%.1f", consumo) + " litros");
        }

        System.out.println("Total de combustível consumido: " + String.format("%.1f", totalCombustivel) + " litros");
    }
}
