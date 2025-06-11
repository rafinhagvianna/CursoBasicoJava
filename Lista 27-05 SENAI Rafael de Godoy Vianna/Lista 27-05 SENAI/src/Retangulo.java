public class Retangulo {
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;

    }
    public Retangulo(double lado){
        this.largura = lado;
        this.altura = lado;

    }
    public String calcularArea() {
        return "A área do retângulo é de " + (largura * altura) + "m²";

    }
}
