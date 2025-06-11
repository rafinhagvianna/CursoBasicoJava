package ex01;

public class PessoaJuridica extends Contribuinte {
    private int qtdFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int qtdFuncionarios) {
        super(nome, rendaAnual);
        this.qtdFuncionarios = qtdFuncionarios;
    }

    @Override
    public double calcularImposto() {
        if (qtdFuncionarios > 10) {
            System.out.println("Como a empresa tem mais de 10 funcionários o imposto calculado foi de 14%.");
            System.out.println("A renda anual da empresa é de:");
            return (rendaAnual * 0.14);
        } else
            System.out.println("Como a empresa tem menos de 10 funcionários o imposto calculado foi de 16%.");
        System.out.println("A renda anual da empresa é de:");
        return (rendaAnual * 0.16);
    }
}
