import java.util.Scanner;

/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura da pirâmide: ");
        int altura = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura desejada da pirâmide.");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2* i - 1); k++) {
                System.out.print("☆");
            }
            System.out.println();
        }


    }
}
