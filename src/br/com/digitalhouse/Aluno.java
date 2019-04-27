package br.com.digitalhouse;

import java.util.Objects;

public class Aluno {

    //Atributos
    private String nome;
    private String sobrenome;
    private int codigoAluno;

    //Construtor
    public Aluno(String nome, String sobrenome, int codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }


    //Metodos
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codigoAluno=" + codigoAluno +
                '}';
    }

    @Override
    public boolean equals(Object objetoAluno) {

        if (!( objetoAluno instanceof Aluno)) {
            return false;
        }

        if (this.codigoAluno == ((Aluno) objetoAluno).codigoAluno) {
            return true;
        } else {
            return false;
        }
    }

}
