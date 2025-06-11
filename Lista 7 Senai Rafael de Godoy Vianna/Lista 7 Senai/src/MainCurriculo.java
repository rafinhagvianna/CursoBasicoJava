import java.util.Scanner;

public class MainCurriculo {
    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        curriculo.nome = sc.nextLine();
        System.out.println("Informe a sua idade:");
        curriculo.idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe a sua profissão:");
        curriculo.profissao = sc.nextLine();
        System.out.println("Informe a sua experiência profissional:");
        curriculo.experiencia = sc.nextLine();

        System.out.println(curriculo.sobreMim());


    }
}
