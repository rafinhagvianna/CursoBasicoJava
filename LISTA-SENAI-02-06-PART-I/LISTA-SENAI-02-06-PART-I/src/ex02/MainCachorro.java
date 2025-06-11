package ex02;

public class MainCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Labrador");
        Cachorro cachorro2 = new Cachorro("Bella", "Husky"); // Husky não está na lista de raças válidas

        cachorro1.imprimir();
        cachorro2.imprimir();

        cachorro2.setNome("Bella Modificada");
        cachorro2.setRaca("Poodle");

        cachorro2.imprimir();

        Cachorro encontrado = Cachorro.localizarPorID(1);
        if (encontrado != null) {
            System.out.println("Cachorro encontrado pelo ID 1: " + encontrado.getNome());
        }

        cachorro1.latir();
        cachorro1.latir();
        cachorro2.latir();
    }
}
