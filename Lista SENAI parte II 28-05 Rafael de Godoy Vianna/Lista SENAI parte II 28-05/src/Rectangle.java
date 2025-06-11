public class Rectangle {
    private double comprimento;
    private double largura;

    public Rectangle(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("O comprimento não pode ser negativo ou zero!");
        }
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("A largura não pode ser negativa ou zero!");
        }
        this.largura = largura;
    }

    public boolean isQuadrado() {
        return comprimento == largura;
    }

    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(comprimento, 2) + Math.pow(largura, 2));
    }

    public void redimensionar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de redimensionamento deve ser positivo!");
        }
        comprimento *= fator;
        largura *= fator;
    }

    public void exibirDados() {
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
        System.out.println("Diagonal: " + calcularDiagonal());
        System.out.println(isQuadrado() ? "Este é um quadrado." : "Este é um retângulo.");
    }
}
