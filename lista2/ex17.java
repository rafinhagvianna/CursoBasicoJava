import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números.");
        int n = sc.nextInt();
        int n2 = sc.nextInt();


    }

    public static double numeroMaior(int n, int n2) {
        if (n > n2) {
            return n;
        } else {
            return n2;
        }


    }
}