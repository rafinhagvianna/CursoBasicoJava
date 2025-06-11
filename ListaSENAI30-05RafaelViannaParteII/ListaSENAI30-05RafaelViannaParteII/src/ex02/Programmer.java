package ex02;

public class Programmer extends Funcionario {
    private double horasCodificacao;
    private String nome;

    public Programmer(String nome, String endereco, double salario) {
        super(nome, endereco, salario, "Programmer");
        this.horasCodificacao = 0;
    }

    public void registrarHoras(double horas) {
        horasCodificacao += horas;
        System.out.println(nome + " registrou " + horas + " horas de codificação hoje.");
    }

    public void exibirHorasTotais() {
        System.out.println("Horas totais de codificação de " + nome + ": " + horasCodificacao + " horas.");
    }
}

