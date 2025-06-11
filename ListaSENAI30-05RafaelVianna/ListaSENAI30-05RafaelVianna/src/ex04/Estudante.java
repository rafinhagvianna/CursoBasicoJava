package ex04;

public class Estudante extends Pessoa {

    Pessoa pessoa = new Pessoa();

    public Estudante() {

    }


    public String exibirDados(){
        return pessoa.getNome() + " " + pessoa.getIdade() ;

    }
}
