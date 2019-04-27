package br.com.digitalhouse;

public class ProfessorTitular extends Professor{

    //Atributos
    private String especialidade;

    //Construtor
    public ProfessorTitular() {
    }

    public ProfessorTitular(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    //Getter and Setter
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //Metodos
    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }
}
