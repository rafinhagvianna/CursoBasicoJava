import java.time.LocalDateTime;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class Inicializador {
    private static int initialValue;
    private static String config;
    private static LocalDateTime timestamp;
    private static Properties properties = new Properties();

    static {
        initialValue = 1000;
        System.out.println("Bloco estático 1: initialValue definido para " + initialValue);
    }

    static {
        timestamp = LocalDateTime.now();
        System.out.println("Bloco estático 2: Inicialização registrada em " + timestamp);
    }

    static {
        String ambiente = System.getProperty("app.env", "produção"); // Assume "produção" se não especificado
        config = "Configuração do ambiente: " + ambiente;
        System.out.println("Bloco estático 3: " + config);
    }

    static {
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
            System.out.println("Bloco estático 4: Dados carregados do arquivo de configuração.");
        } catch (IOException e) {
            System.out.println("Bloco estático 4: Arquivo de configuração não encontrado, usando valores padrão.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Valor inicial de 'initialValue' antes da instância: " + initialValue);

        Inicializador obj = new Inicializador();

        System.out.println("Valor de 'initialValue' após a criação da instância: " + initialValue);
        System.out.println("Timestamp de inicialização: " + timestamp);
        System.out.println("Configuração do ambiente carregada: " + config);

        System.out.println("Configuração carregada do arquivo:");
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
