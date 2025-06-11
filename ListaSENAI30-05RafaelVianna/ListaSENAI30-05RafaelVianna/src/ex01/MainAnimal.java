package ex01;

public class MainAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println(cachorro.fazerSom());
        System.out.println(gato.fazerSom());
    }
}
