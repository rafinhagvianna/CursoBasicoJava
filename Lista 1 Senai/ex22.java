import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de kWh consumido no mes e o valor do kWh para calcular o valor da conta de energia.");
        double kWh = sc.nextDouble();
        double valor = sc.nextDouble();
        double conta = kWh * valor ;
        System.out.println("o valor da conta de energia é de " + conta + " R$");

    }
}
