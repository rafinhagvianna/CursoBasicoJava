package ex02;

public class Manager extends Funcionario {
    private double salario;
    private String nome;

    public Manager(String nome, String endereco, double salario) {
        super(nome, endereco, salario, "Manager");
    }

    public double calcularBonus(int classificacaoDesempenho) {
        double bonus;
        switch (classificacaoDesempenho) {
            case 5:
                bonus = salario * 0.30;
                break;
            case 4:
                bonus = salario * 0.20;
                break;
            case 3:
                bonus = salario * 0.10;
                break;
            default:
                bonus = 0;
                break;
        }
        System.out.println("Bônus para " + nome + ": R$ " + bonus);
        return bonus;
    }
}

