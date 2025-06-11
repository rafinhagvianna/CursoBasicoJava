public class Constantes {
    // Variáveis finais estáticas para constantes matemáticas
    public static final double PI = 3.14159;
    public static final double E = 2.71828;
    public static final double PHI = 1.61803;

    // Conversões de unidades
    public static final double MILHA_PARA_KM = 1.60934;
    public static final double KG_PARA_LIBRA = 2.20462;

    // Constantes físicas
    public static final double GRAVIDADE_TERRESTRE = 9.80665; // m/s²
    public static final double VELOCIDADE_LUZ = 299792458; // m/s

    // Valores de configuração (somente leitura)
    private static final String VERSAO_SOFTWARE = "1.0.0";
    private static final String NOME_APP = "CalcMaster";

    // Método para calcular a área de um círculo
    public static double calcularAreaCirculo(double raio) {
        return PI * raio * raio;
    }

    // Métodos para acessar valores de configuração
    public static String getVersaoSoftware() {
        return VERSAO_SOFTWARE;
    }

    public static String getNomeApp() {
        return NOME_APP;
    }

    public static void main(String[] args) {
        // Demonstração dos métodos e constantes
        System.out.println("Área de um círculo de raio 5: " + calcularAreaCirculo(5));
        System.out.println("Valor de PI: " + PI);
        System.out.println("Valor de e (Euler): " + E);
        System.out.println("Conversão de 10 milhas para km: " + (10 * MILHA_PARA_KM));
        System.out.println("Força gravitacional na Terra: " + GRAVIDADE_TERRESTRE + " m/s²");
        System.out.println("Nome do aplicativo: " + getNomeApp());
        System.out.println("Versão do software: " + getVersaoSoftware());
    }
}
