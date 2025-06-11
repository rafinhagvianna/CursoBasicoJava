import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioReal = "rafael";
        String senhaReal = "pizza";
        System.out.print("informe o usuário.");
        String usuario = sc.nextLine();
        System.out.print("Digite a senha.");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioReal)  && senha.equals(senhaReal)){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado");
        }


    }
}
