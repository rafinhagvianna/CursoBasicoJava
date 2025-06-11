package ex02;

public class  Empresa {
    public static void main(String[] args) {
        // Criando objetos
        Manager gerente = new Manager("Carlos Silva", "Rua A, 123", 10000);
        Developer desenvolvedor = new Developer("Ana Souza", "Av. B, 456", 8000);
        Programmer programador = new Programmer("Lucas Lima", "Rua C, 789", 7000);

        // Exibindo informações
        gerente.exibirInformacoes();
        desenvolvedor.exibirInformacoes();
        programador.exibirInformacoes();

        System.out.println("\n--- Bônus do Gerente ---");
        gerente.calcularBonus(4);

        System.out.println("\n--- Monitoramento de Projetos do Developer ---");
        desenvolvedor.concluirProjeto();
        desenvolvedor.adicionarPrazoPendente();
        desenvolvedor.monitorarProjetos();

        System.out.println("\n--- Registro de Horas do Programmer ---");
        programador.registrarHoras(5);
        programador.registrarHoras(3.5);
        programador.exibirHorasTotais();

        System.out.println("\n--- Programa de Mentoria ---");
        gerente.programaMentoria();
        desenvolvedor.programaMentoria();
        programador.programaMentoria();
    }
}

