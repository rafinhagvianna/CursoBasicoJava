public class ex06 {
    public static void main(String[] args) {
        int i = 1;
        int contarMultiplos = 0;
        System.out.println("Abaixo os números múltiplos de 3 de 1 a 50:");
        while (i <= 50) {
            if (i % 3 == 0) {
                contarMultiplos++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("O número de múltiplos de 3 de 1 a 50 é de :" + contarMultiplos);
    }
}

