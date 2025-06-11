import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de um produto e o desconto(de 0 a 100 porcento)");
        double valor = sc.nextDouble();
        double desconto = sc.nextDouble();
        System.out.println("O valor final do produto é de:" + (valor-(valor*desconto*0.01)) + " R$ ");

    }
}
