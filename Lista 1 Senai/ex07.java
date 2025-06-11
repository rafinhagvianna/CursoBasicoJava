import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois números inteiros.");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = n + n2;
        System.out.println("O soma é:" + "\n" + n3);

    }
}
