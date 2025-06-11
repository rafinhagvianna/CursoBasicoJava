import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        System.out.println("Escolha um número de 1 a 7.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("hoje é segunda.");
                break;
            case 2:
                System.out.println("hoje é terça.");
                break;
            case 3:
                System.out.println("hoje é quarta.");
                break;
            case 4:
                System.out.println("hoje é quinta.");
                break;
            case 5:
                System.out.println("hoje é sexta.");
                break;
            case 6:
                System.out.println("hoje é sábado.");
                break;
            case 7:
                System.out.println("hoje é domingo");
                break;
            default:
                System.out.println("Insira um digito válido.");
                break;
        }

    }
}
