import java.util.Scanner;

public class Cachorro {
    String nome;
    String cor;
    int latidos;
    boolean treinado;
    boolean racaGrande;
    Scanner sc = new Scanner(System.in);
    public Cachorro() {
        System.out.println("Qual o nome do cachorro?");
        this.nome = sc.nextLine();
        System.out.println("Qual a cor do cachorro?");
        this.cor = sc.nextLine();

    }
}
