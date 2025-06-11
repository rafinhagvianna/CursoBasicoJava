import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        System.out.println("Digite as coordenadas:");
        Scanner sc = new Scanner(System.in);
        System.out.print("x:");
        int x = sc.nextInt();
        System.out.print("y:");
        int y = sc.nextInt();
        if (x> 0 && y> 0) {
            System.out.println("1° Quadrante.");
        }else if (x< 0 && y > 0) {
            System.out.println("2° Quadrante.");
        }else if (x< 0 && y < 0) {
            System.out.println("3° Quadrante.");
        }else
            System.out.println("4° Quadrante.");
    }
}
