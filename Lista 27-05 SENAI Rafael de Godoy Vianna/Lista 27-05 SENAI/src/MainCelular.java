import java.util.Scanner;

public class MainCelular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome os dados do celular.");
        System.out.println("Marca:");
        String marca = sc.nextLine();
        System.out.println("Modelo:");
        String modelo = sc.nextLine();
        System.out.println("Ano:");
        int ano = sc.nextInt();
        Celular celular = new Celular(marca, modelo, ano);
        System.out.println(celular.exibirCelular());
    }
}
