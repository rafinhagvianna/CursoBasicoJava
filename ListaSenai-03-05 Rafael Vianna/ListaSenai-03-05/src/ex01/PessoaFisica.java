package ex01;

public class PessoaFisica extends Contribuinte {
    private double saudeGasto;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double saudeGasto) {
        super(nome, rendaAnual);
        this.saudeGasto = saudeGasto;
    }

    @Override
    public double calcularImposto() {
        double imposto;

        if (rendaAnual < 20000) {
            imposto = rendaAnual * 0.15;
        } else {
            imposto = rendaAnual * 0.25;
        }

        imposto -= saudeGasto * 0.5;

        return Math.max(imposto, 0);
    }
}


