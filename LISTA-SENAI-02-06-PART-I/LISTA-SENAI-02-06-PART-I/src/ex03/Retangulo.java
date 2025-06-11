package ex03;

class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public boolean cabeDentro(Retangulo outro) {
        return this.largura <= outro.largura && this.altura <= outro.altura;
    }

    public boolean sobrepoe(Retangulo outro, double x1, double y1, double x2, double y2) {
        return !(x1 + this.largura <= x2 || x2 + outro.largura <= x1 || y1 + this.altura <= y2 || y2 + outro.altura <= y1);
    }
    public void imprimir() {
        System.out.println("Largura: " + largura + ", Altura: " + altura);
        System.out.println("Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro());
    }
}

final class RetanguloImutavel {
    private final double largura;
    private final double altura;

    public RetanguloImutavel(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void imprimir() {
        System.out.println("Retângulo Imutável - Largura: " + largura + ", Altura: " + altura);
        System.out.println("Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro());
    }
}


