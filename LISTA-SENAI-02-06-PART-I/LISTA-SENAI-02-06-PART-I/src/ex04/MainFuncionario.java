package ex04;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Alice", "Gerente", 8000, 5);
        Funcionario funcionario2 = new Funcionario("Bob", "Analista", 5000, 2);
        Funcionario funcionario3 = new Funcionario("Carlos", "Estagiário", 2000, 0);

        funcionario1.imprimir();
        funcionario2.imprimir();
        funcionario3.imprimir();

        Funcionario melhorPago = Funcionario.getMaisBemPago();
        if (melhorPago != null) {
            System.out.println("Funcionário mais bem pago: " + melhorPago.getNome());
        } else {
            System.out.println("Nenhum funcionário registrado como mais bem pago ainda.");
        }

        System.out.println("Bônus de Alice: R$" + funcionario1.calcularBonus());
        System.out.println("Bônus de Bob: R$" + funcionario2.calcularBonus());

        funcionario3.atualizarSalario(2500); // Deve falhar
        funcionario2.atualizarSalario(6000); // Deve funcionar
        funcionario2.imprimir();

        FuncionarioImutavel funcionarioImutavel = new FuncionarioImutavel("Daniel", "Diretor", 10000, 10);
        funcionarioImutavel.imprimir();
    }
}
