import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você tem carteira de motorista(sim ou nao)?");
        String resp = sc.nextLine();
        if (resp.equals("sim")) {

        }else {
            System.out.println("OK");
            return;
        }


        System.out.println("Informe a sua idade");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Você possui carteira de motorista.");
        }else{
            System.out.println("Você não possui a idade necessária para ter carteira de motorista.");

        }
    }
}
