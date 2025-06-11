package ex02;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected String placa;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = gerarPlaca();
    }

    private String gerarPlaca() {
        String letras = "";
        for (int i = 0; i < 3; i++) {
            letras += (char) (65 + (int)(Math.random() * 26));
        }
        int numeros = (int)(1000 + Math.random() * 9000);
        return letras + "-" + numeros;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
    }
}
