package br.com.digitalhouse;

import java.util.Objects;

public abstract class Professor {

    //Atributos
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoProfessor;

    //Construtor
    public Professor() {
    }

    public Professor(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
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

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    //Metodos
    @Override
    public boolean equals(Object objetoProfessor) {

        if (!( objetoProfessor instanceof Professor)) {
            return false;
        }

        if (this.codigoProfessor == ((Professor) objetoProfessor).codigoProfessor) {
            return true;
        } else {
            return false;
        }
    }

}
