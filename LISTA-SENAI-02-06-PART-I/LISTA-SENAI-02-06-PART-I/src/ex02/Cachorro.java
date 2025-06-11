package ex02;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Cachorro {
    private static int contadorID = 0; // Contador para IDs únicos
    private int id;
    private String nome;
    private String raca;
    private int latidos;
    private static HashMap<Integer, Cachorro> registros = new HashMap<>();
    private static Set<String> racasValidas = new HashSet<>();

    static {
        racasValidas.add("Labrador");
        racasValidas.add("Bulldog");
        racasValidas.add("Poodle");
        racasValidas.add("Golden Retriever");
    }

    public Cachorro(String nome, String raca) {
        this.id = ++contadorID;
        setRaca(raca); // Usa método para validar raça
        this.nome = nome;
        this.latidos = 0;
        registros.put(this.id, this);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (racasValidas.contains(raca)) {
            this.raca = raca;
        } else {
            System.out.println("Raça inválida! Definindo como 'Indefinida'.");
            this.raca = "Indefinida";
        }
    }

    public int getLatidos() {
        return latidos;
    }

    public void latir() {
        latidos++;
        System.out.println(nome + " latiu! Total de latidos: " + latidos);
    }

    public static Cachorro localizarPorID(int id) {
        return registros.get(id);
    }

    public void imprimir() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Raça: " + raca + ", Latidos: " + latidos);
    }
}

