package ex03;

public class FormaGeometrica {
    public String calcularArea(int raio, int altura, int largura ) {
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        retangulo.setAltura(altura);
        retangulo.setLargura(largura);
        circulo.setRaio(raio);
        return "Área do círculo: " + circulo.calcularArea() + "\nÁrea do retângulo: " + retangulo.calcularArea();
    }
}
