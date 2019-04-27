package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    //Atributos
    private String nome;
    private int codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int qtdeMaximaAlunos;
    private List<Aluno> listaAlunosMatriculados = new ArrayList<>();

    //Construtor
    public Curso() {
    }

    public Curso(String nome, int codigoCurso, int qtdeMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
    }

    public Curso(String nome, int codigoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, int qtdeMaximaAlunos, List<Aluno> listaAlunosMatriculados) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getQtdeMaximaAlunos() {
        return qtdeMaximaAlunos;
    }

    public void setQtdeMaximaAlunos(int qtdeMaximaAlunos) {
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    //Metodos
    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", professorTitular=" + professorTitular +
                ", professorAdjunto=" + professorAdjunto +
                ", qtdeMaximaAlunos=" + qtdeMaximaAlunos +
                ", listaAlunosMatriculados=" + listaAlunosMatriculados +
                '}';
    }

    @Override
    public boolean equals(Object objetoCurso) {

        if (!(objetoCurso instanceof Curso)) {
            return false;
        }

        if (this.codigoCurso == ((Curso) objetoCurso).getCodigoCurso()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean adicionarUmAluno(Aluno umAluno) {

        //Permtitir adicionar aluno somente se houver vaga disponível
        int qtdAtualDeAlunos = listaAlunosMatriculados.size();
        int qtdVagasDisponiveis = qtdeMaximaAlunos - qtdAtualDeAlunos;

        if (qtdVagasDisponiveis > 0){
            listaAlunosMatriculados.add(umAluno);
            return true;
        } else {
            return false;
        }

    }

    public void excluirAluno(Aluno umAluno) {

        listaAlunosMatriculados.remove(umAluno);

    }


}
