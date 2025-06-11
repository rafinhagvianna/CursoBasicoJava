public class ex13 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        while (numero <= 100) {
            if (numero % 2 == 0)
                soma += numero;

            numero++;

        }

        System.out.println(soma);
    }


}
