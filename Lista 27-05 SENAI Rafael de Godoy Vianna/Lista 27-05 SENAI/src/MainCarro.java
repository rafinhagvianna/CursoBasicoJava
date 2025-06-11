import java.util.Scanner;
public class MainCarro {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a marca do carro: ");
        String marca = sc.nextLine();

        System.out.print("Informe o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Informe o ano do carro: ");
        int ano = sc.nextInt();

        Carro meuCarro = new Carro(marca, modelo, ano);

        System.out.println(meuCarro.exibirInfo());


    }
}