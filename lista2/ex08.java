import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();
        if (idade >= 18 && idade < 60) {
            System.out.println("adulto.");
        } else if (idade < 18 && idade > 12) {
            System.out.println("adolescente.");
        } else if (idade > 0 && idade <= 12) {
            System.out.println("criança.");
        } else if (idade >= 60 && idade < 120) {
            System.out.println("idoso.");
        }else {
            System.out.println("Insira uma idade válida");


        }
    }


}


