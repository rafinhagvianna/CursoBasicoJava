package ex03;

public class Main {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(5, 8);
        Retangulo ret2 = new Retangulo(3, 4);

        ret1.imprimir();
        ret2.imprimir();

        System.out.println("Retângulo 2 cabe dentro do Retângulo 1? " + ret2.cabeDentro(ret1));

        System.out.println("Os retângulos se sobrepõem? " + ret1.sobrepoe(ret2, 2, 2, 4, 4));

        RetanguloImutavel retImutavel = new RetanguloImutavel(6, 9);
        retImutavel.imprimir();
    }
}
