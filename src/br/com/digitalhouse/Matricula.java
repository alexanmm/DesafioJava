package br.com.digitalhouse;

import java.util.Date;

public class Matricula {

    //Atributos
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;

    //Construtor
    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;

        //Data do dia
        this.dataMatricula = new Date();
    }

    //Getter and Setter
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }


    //Metodos
    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                ", dataMatricula=" + dataMatricula +
                '}';
    }
}
