import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário do funcionário e a porcentagem de aumento (de 0 a 100 porcento)");
        double salario = sc.nextDouble();
        double aumento = sc.nextDouble();
        double salarioFinal = salario + (salario * aumento * 0.01);
        System.out.println("O salário novo após o aumento é de " + salarioFinal + "R$");
    }
}
