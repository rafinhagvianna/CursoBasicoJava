import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número cujo você quer ver a tabuada.");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.println(i + " X " + n + " = " + n*i);
        }
    }
}
