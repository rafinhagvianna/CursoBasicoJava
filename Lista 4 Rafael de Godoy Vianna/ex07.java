import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira quaisquer números, quando quiser fazer a média deles, insira o número 0.");
        double n;
        int contarNumerosDigitados = 0;
        double contarNumeros = 0;


        do {
            n = sc.nextDouble();
            contarNumeros+= n;
            contarNumerosDigitados++;



        }
        while (n != 0);
        contarNumerosDigitados = contarNumerosDigitados -1;
        System.out.println("A média dos números digitados é " + contarNumeros / contarNumerosDigitados );
        ;


    }
}