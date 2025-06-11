import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private int notas;
    private ArrayList<Integer> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }

    public Student(int student_id, String student_name, int notas) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.notas = notas;
        this.grades = new ArrayList<>();
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        if (notas <= 0) {
            throw new IllegalArgumentException("O número de notas deve ser maior que zero.");
        }
        this.notas = notas;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        if (String.valueOf(student_id).length() != 4) {
            throw new IllegalArgumentException("O id deve ter 4 digitos.");
        }
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        if (student_name.isEmpty()) {
            throw new IllegalArgumentException("O nome do estudante não pode ser vazio.");
        }
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Insira uma nota válida (de 0 a 100).");
        }
        this.grades.add(grade);
    }

    public double calcularMedia() {
        if (grades.isEmpty()) {
            return 0;
        }
        int soma = 0;
        for (int g : grades) {
            soma += g;
        }
        return (double) soma / grades.size();
    }
}
