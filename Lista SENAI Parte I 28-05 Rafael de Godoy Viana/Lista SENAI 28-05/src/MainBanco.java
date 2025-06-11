import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("==========Criando a sua conta==========");
        System.out.println("Informe o número da conta.");
        int numeroConta = sc.nextInt();
        banco.setNumeroConta(numeroConta);

        System.out.println("Digite a sua senha.");
        String senha = sc.next();
        banco.setSenha(senha);

        System.out.println("Informe o nome do titular da conta.");
        String titular = sc.next();
        banco.setTitular(titular);

        System.out.println("Deseja informar o valor do deposito inicial?");
        String resultado = sc.next();
        sc.nextLine();
        if (resultado.equalsIgnoreCase("sim")) {
            System.out.println("informe o valor do depósito inicial da sua conta");
            double saldo = sc.nextDouble();
            banco.setSaldo(saldo);
        } else banco.setSaldo(0);
        System.out.println("Sua conta foi criada com sucesso, " + titular + " !");
        System.out.println("Faça seu login inicial.");

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Senha: ");
        String password = sc.nextLine();
        int tentativas = 1;
        while ((numero != numeroConta) || (!password.equals(senha))) {
            if (tentativas == 2) {
                System.out.println("Senha Incorreta! Você tem mais " + (3 - tentativas) + " tentativa. ");
            } else System.out.println("Senha Incorreta! Você tem mais " + (3 - tentativas) + " tentativas.");
            System.out.print("Número da conta: ");
            numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Senha: ");
            password = sc.nextLine();


            tentativas++;
            if ((((numero != numeroConta) || (!password.equals(senha))) && tentativas >= 3)) {
                System.out.println("A senha foi bloqueada");
                return;
            }
        }
        System.out.println("Seja bem vindo!" + titular);
        System.out.println("Qual operação deseja realizar?");
        System.out.println(" 1  -> Ver Saldo \n 2  -> Depositar \n 3  -> Sacar \n 4  -> Alterar nome do Titular \n 5  -> Mostrar detalhes da conta \n 6  -> Sair \n ");
        int opcaoUsuario = sc.nextInt();
        while (opcaoUsuario != 6) {

            switch (opcaoUsuario) {
                case 1:
                    System.out.println(banco.getSaldo() + " R$ ");
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja depositar:");
                    double valorDeposito = sc.nextDouble();
                    banco.deposito(valorDeposito);
                    break;
                case 3:
                    System.out.println("Insira o valor que deseja sacar:");
                    double valorSaque = sc.nextDouble();
                    banco.saque(valorSaque);
                    break;
                case 4:
                    System.out.println("Insira o novo nome que deseja colocar:");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    banco.setTitular(nome);
                    break;
                case 5:
                    System.out.println("Abaixo os dados da conta:");
                    System.out.println(banco.exibirInformacoes());
                    break;
                default:
                    System.out.println("Insira um dígito válido.");


            }
            System.out.println("Insira o que deseja fazer a seguir:");
            System.out.println(" 1  -> Ver Saldo \n 2  -> Depositar \n 3  -> Sacar \n 4  -> Alterar nome do Titular \n 5  -> Mostrar detalhes da conta \n 6  -> Sair \n ");
            opcaoUsuario = sc.nextInt();
        }
        System.out.println("Obrigado por utilizar nosso sistema, " + titular + " !");
    }

}
