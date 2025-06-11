import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os números que deseja somar, quando quiser ver o resultado digite -1.");
        int n;
        int soma = 0;
        do {
            System.out.println("Digite o próximo número.");
            n = sc.nextInt();
            soma += n;


        } while (n != -1);
        System.out.println("O resultado digite da soma foi " + (soma+1));
        sc.close();


    }
}