import java.util.Scanner;

public class MainConversor {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em celsius");
        double celsius = sc.nextDouble();
        System.out.println("Informe a temperatura em fahreinheint");
        double fahrenheit = sc.nextDouble();


        System.out.println(celsius + "°C em Fahrenheit: " + String.format("%.2f", ConversorTemperatura.celsiusParaFahrenheit(fahrenheit)) + "°F");
        System.out.println(fahrenheit + "°F em Celsius: " + String.format("%.2f", ConversorTemperatura.fahrenheitParaCelsius(fahrenheit)) + "°C");
    }
}
