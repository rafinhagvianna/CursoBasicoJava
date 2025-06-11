import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Este programa calcula a média de suas notas.");

        System.out.print("Digite o seu id (4 dígitos): ");
        student.setStudent_id(sc.nextInt());

        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        student.setStudent_name(sc.nextLine());

        System.out.print("Quantas matérias para realizar a média? ");
        student.setNotas(sc.nextInt());

        for (int i = 1; i <= student.getNotas(); i++) {
            System.out.print("Nota da matéria " + i + ": ");
            int nota = sc.nextInt();
            student.addGrade(nota);
        }

        double media = student.calcularMedia();
        System.out.println("A média das notas é: " + media);
    }
}
