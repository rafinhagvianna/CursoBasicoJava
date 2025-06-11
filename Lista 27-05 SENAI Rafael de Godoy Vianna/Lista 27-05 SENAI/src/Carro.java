import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String exibirInfo() {
        return "A marca do carro é " + marca + ", sendo do modelo " + modelo + " e do ano " + ano + ".";
    }
}