public class Calcular {

    public static final double PI = 3.14;

    public static String calcularCircunferencia(double raio) {
        double pi = 3.14;
        double circunferencia = 2 * pi * raio ;
        return "O valor da circunferencia é de: " + String.format("%.2f", circunferencia) + " cm.";

    }

    public static String calcularVolume(double raio) {
        double pi = 3.14;
        double area = 4 * pi * (raio * raio * raio) / 3;
        return "O valor da área é de: " + String.format("%.2f", area) + " cm³.";

    }

}
