import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite duas strings para compará-las.");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Suas Strings são iguais.");
        }else{
            System.out.println("Suas Strings não são iguais.");
        }
    }
}
