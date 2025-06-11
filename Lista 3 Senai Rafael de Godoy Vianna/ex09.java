import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula se o número é multiplo de 5");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("O número é multiplo de 5");
        }else{
            System.out.println("O número não é multiplo de 5");

        }
    }
}
