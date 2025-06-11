public class ex14 {
    public static void main(String[] args) {
        int i = 1;
        int contarPares = 0;
        int contarImpares = 0;
        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println(i + " -> Par");
                contarPares++;
            } else {
                System.out.println(i + " -> Ímpar");
                contarImpares++;



            }
            i++;
        }
        System.out.println("Há "+ contarPares + " números pares");
        System.out.println("Há "+ contarImpares + " números ímpares");
    }
}