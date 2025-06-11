import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a distancia em quilometros e a velocidade média em hm/h para calcular o tempo estimado de viagem.");
        double distancia = sc.nextInt();
        double velocidadeMedia = sc.nextInt();
        double tempoEstimado = distancia / velocidadeMedia;



        if (tempoEstimado > 1.0) {

            System.out.println("O tempo de viagem estimado é de " + tempoEstimado + " horas.");
        } else if (tempoEstimado <= 1.0 && tempoEstimado > 0.0) {


            System.out.println("O tempo de viagem estimado é de " + tempoEstimado + " hora.");
        } else

            System.out.println(" insira um valor válido.");


    }
}
