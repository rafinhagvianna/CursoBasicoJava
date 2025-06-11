import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua senha");
        String senha = sc.nextLine();
        if (senha.equals("rafael")) {
            System.out.println("Acesso liberado.");
        } else{
            System.out.println("Acesso negado.");
        }


    }
}
