package ex01;

public class MainContribuinte {
    public static void main(String[] args) {

        Contribuinte contribuinte1 = new PessoaFisica(" Joao Silva",50000, 2000);
        Contribuinte contribuinte2 = new PessoaFisica(" Maria Souza,",15000, 0);
        Contribuinte contribuinte3 = new PessoaJuridica(" Senai Solutions",400000, 25);

        System.out.println("Imposto pago pelo contribuinte joão : " + contribuinte1.calcularImposto());
        System.out.println();
        System.out.println("Imposto pago pela contribuinte Maria Souza : " + contribuinte2.calcularImposto());
        System.out.println();
        System.out.println("Imposto pago pelo contribuinte Senai Solutions : " + contribuinte3.calcularImposto());
        System.out.println();

    }
}
