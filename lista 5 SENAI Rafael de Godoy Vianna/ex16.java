public class ex16 {
    public static void main(String[] args) {
        System.out.println(" Este programa calcula quantos múltiplos de sete têm de 1 à 1000 ");
        int contarMultiplos = 0;
        for(int i = 1; i <= 1000; i++){
            if (i % 7 == 0){
                contarMultiplos++;
                System.out.println(i+" é um múltiplo de 7.0");

            }
        }

        System.out.println("Há " + contarMultiplos + " números múltiplos de 7 no intervalo de 1 à 1000.");
    }
}
