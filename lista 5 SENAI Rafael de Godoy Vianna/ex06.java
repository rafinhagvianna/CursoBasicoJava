import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números diferentes para ver qual o maior.");
        System.out.print("n1:");
        int n = sc.nextInt();
        System.out.print("n2:");
        int n2 = sc.nextInt();
        System.out.print("n3:");
        int n3 = sc.nextInt();
        if (n > n2 && n > n3) {
            System.out.println(n + " é o maior número.");
        } else if (n2 > n && n2 > n3) {
            System.out.println(n2 + " é o maior número.");
        } else if (n3 > n && n3 > n2) {
            System.out.println(n3 + " é o maior número.");
        }
        else
            System.out.println("Insira números diferentes.");


    }
}
