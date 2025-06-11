import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números para tirar a média.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int media = (num1 + num2 +num3)/3;
        System.out.println("A média é : " + media);



    }
}
