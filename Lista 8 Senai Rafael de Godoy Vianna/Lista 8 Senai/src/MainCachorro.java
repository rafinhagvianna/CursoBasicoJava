import java.util.Scanner;

public class MainCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas vezes seu cachorro late?");
        cachorro.latidos = sc.nextInt();
        System.out.println("Seu cachorro é treinado?(true or false)");
        cachorro.treinado = sc.nextBoolean();
        System.out.println("A raça do seu cachorro é grande?(true or false)");
        cachorro.racaGrande = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Abaixo os dados do cachorro:");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Cor: " + cachorro.cor);
        System.out.println("Número de latidos: " + cachorro.latidos);
        System.out.println("O cachorro é treinado? " + cachorro.treinado);
        System.out.println("A raça do seu cachorro é grande?" + cachorro.racaGrande);
        if (cachorro.cor.equals(cachorro2.cor)){
            System.out.println("As cores dos dois cachorros são iguais, sendo da cor " + cachorro2.cor);
        }else
            System.out.println("As cores dos dois cachorros são diferentes, um é da cor " + cachorro.cor + " e o outro é da cor " + cachorro2.cor);
    }
}
