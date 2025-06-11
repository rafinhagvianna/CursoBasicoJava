import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são?");
        int horas = sc.nextInt();
        if (horas < 12 && horas >= 6) {
            System.out.println("Bom dia.");
        }    else if (horas >= 0 && horas < 6 || horas >= 18 && horas <= 24) {
                System.out.println("Boa noite.");
            }else if (horas >=12 && horas < 18) {
            System.out.println("Boa tarde.");

        }


    }
}
