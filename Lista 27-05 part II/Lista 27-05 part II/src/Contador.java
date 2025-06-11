import java.util.Scanner;

public class Contador {
    private static int totalCount = 0;
    private static int maxInstances;
    private int id;

    public Contador() {
        if (totalCount < maxInstances) {
            totalCount++;
            this.id = totalCount;
        } else {
            throw new RuntimeException("Número máximo de instâncias atingido!");
        }
    }

    public static void setMaxInstances(int max) {
        maxInstances = max;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void resetCount() {
        totalCount = 0;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número máximo de instâncias permitidas: ");
        int max = scanner.nextInt();
        setMaxInstances(max);

        try {
            Contador[] contadores = new Contador[max + 1]; // Tentativa de criar uma a mais para testar o limite
            for (int i = 0; i <= max; i++) {
                contadores[i] = new Contador();
                System.out.println("Instância criada: ID " + contadores[i].getId());
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total de instâncias criadas: " + Contador.getTotalCount());

        resetCount();
        System.out.println("Contador zerado! Total de instâncias: " + Contador.getTotalCount());

    }
}
