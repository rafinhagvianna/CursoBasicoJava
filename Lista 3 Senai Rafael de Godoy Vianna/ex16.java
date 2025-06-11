import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        System.out.println("Insira um ano para verificar se ele é bissexto.");
        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano é bissexto.");

        }else{
            System.out.println("O ano não é bissexto.");
        }
    }
}
