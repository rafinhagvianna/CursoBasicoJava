
public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100);
    }

    public void exibirDados() {
        System.out.println("Dados do Funcionário:");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário líquido: %.2f%n", salarioLiquido());
    }
}


