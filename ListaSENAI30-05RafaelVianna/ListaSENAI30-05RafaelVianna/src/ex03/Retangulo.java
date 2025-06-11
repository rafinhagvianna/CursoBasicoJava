package ex03;

public class Retangulo {
    private int largura;
    private int altura;
    public Retangulo() {

    }
    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double calcularArea(){
        return (altura*largura);
    }
}
