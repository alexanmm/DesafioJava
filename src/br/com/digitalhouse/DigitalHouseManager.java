package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //Atributos
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();

    //Construtor
    public DigitalHouseManager() {

    }

    public DigitalHouseManager(List<Aluno> listaAlunos, List<Professor> listaProfessores, List<Curso> listaCursos, List<Matricula> listaMatriculas) {
        this.listaAlunos = listaAlunos;
        this.listaProfessores = listaProfessores;
        this.listaCursos = listaCursos;
        this.listaMatriculas = listaMatriculas;
    }

    //Getter and Setter
    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }


    //Métodos
    @Override
    public String toString() {
        return "DigitalHouseManager{" +
                "listaAlunos=" + listaAlunos +
                ", listaProfessores=" + listaProfessores +
                ", listaCursos=" + listaCursos +
                ", listaMatriculas=" + listaMatriculas +
                '}';
    }

    public void registrarCurso(String nome, int codigoCurso, int qtdeMaxAlunos) {

        Curso novoCurso = new Curso();

        novoCurso.setNome(nome);
        novoCurso.setCodigoCurso(codigoCurso);
        novoCurso.setQtdeMaximaAlunos(qtdeMaxAlunos);

        listaCursos.add(novoCurso);

    }

    public void excluirCurso(int codigoCurso) {

        int posicaoEliminar = -1;

        for (int pos = 0; pos < listaCursos.size(); pos++) {

            if (listaCursos.get(pos).getCodigoCurso() == codigoCurso) {
                posicaoEliminar = pos;
            }

        }

        //Elimina o curso da lista
        if (posicaoEliminar > -1) {
            listaCursos.remove(posicaoEliminar);
        }

    }

    public void registrarProfessorAdjunto(String nome,
                                          String sobrenome,
                                          int codigoProfessor,
                                          int quantidadeDeHoras) {

        Professor novoProfessorAdjunto = new ProfessorAdjunto(
                nome,
                sobrenome,
                0,
                codigoProfessor,
                quantidadeDeHoras);


        listaProfessores.add(novoProfessorAdjunto);

    }

    public void registrarProfessorTitular(String nome,
                                          String sobrenome,
                                          int codigoProfessor,
                                          String especialidade) {

        Professor novoProfessorTitular = new ProfessorTitular(
                nome,
                sobrenome,
                0,
                codigoProfessor,
                especialidade);

        listaProfessores.add(novoProfessorTitular);

    }

    public void excluirProfessor(int codigoProfessor) {

        int posicaoEliminar = -1;

        Breakloop:
        for (int pos = 0; pos < listaProfessores.size(); pos++) {

            if (listaProfessores.get(pos).getCodigoProfessor() == codigoProfessor) {
                posicaoEliminar = pos;

                break Breakloop;
            }
        }

        if (posicaoEliminar > -1) {
            listaProfessores.remove(posicaoEliminar);
        }

    }

    public void matricularAluno(String nome,
                                String sobrenome,
                                int codigoAluno) {

        Aluno novoAluno = new Aluno(nome, sobrenome, codigoAluno);

        listaAlunos.add(novoAluno);
    }

    public void matricularAluno(int codigoAluno,
                                int codigoCurso) {

        //Busca o Aluno
        Breakloop_Aluno:
        for (Aluno linhaAluno : listaAlunos) {
            if (linhaAluno.getCodigoAluno() == codigoAluno) {

                //Busca o Curso
                Breakloop_Curso:
                for (Curso linhaCurso : listaCursos) {

                    if (linhaCurso.getCodigoCurso() == codigoCurso) {
                        //Matricula o Aluno ao Curso
                        boolean alunoMatriculado;

                        alunoMatriculado = linhaCurso.adicionarUmAluno(linhaAluno);

                        if (alunoMatriculado) { //Permitir matrícula do Aluno
                            //Criar matricula do Aluno
                            Matricula novaMatricula = new Matricula(linhaAluno, linhaCurso);

                            listaMatriculas.add(novaMatricula);

                            //Matrícula realizada com sucesso
                            System.out.println(
                                    "Matrícula do Aluno " + linhaAluno.getNome() +
                                            " realizada com sucesso!");
                        } else {
                            //Não foi possível realizar a matrícula porque não há vagas
                            System.out.println(
                                    "Aluno " + linhaAluno.getNome() +
                                            " - Não foi possível realizar a matrícula porque não há vagas");

                        }

                        break Breakloop_Curso;
                    }
                }

                break Breakloop_Aluno;
            }
        }

    }

    public void alocarProfessores(int codigoCurso,
                                  int codigoProfessorTitular,
                                  int codigoProfessorAdjunto) {

        ProfessorTitular novoProfessorTitular = new ProfessorTitular();
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto();

        Breaklooop:
        for (Professor linhaProfessor : listaProfessores) {

            //Buscar o Professor Titular
            if (linhaProfessor.getCodigoProfessor() == codigoProfessorTitular) {
                novoProfessorTitular = (ProfessorTitular) linhaProfessor;
            }

            //Buscar o Professor Adjunto
            if (linhaProfessor.getCodigoProfessor() == codigoProfessorAdjunto) {
                novoProfessorAdjunto = (ProfessorAdjunto) linhaProfessor;
            }

            //Encerra o loop ao encontrar os dois professores
            if (    (novoProfessorTitular.getCodigoProfessor() != 0)
                 && (novoProfessorAdjunto.getCodigoProfessor() != 0)) {

                break Breaklooop;
            }
        }

        if ((!(novoProfessorTitular == null)) && (!(novoProfessorAdjunto == null))) {
            //Busca o Curso
            Breakloop_Curso:
            for (int posicaoCurso = 0; posicaoCurso < listaCursos.size(); posicaoCurso++) {

                //Alocar os Professores: titular e adjunto
                if (listaCursos.get(posicaoCurso).getCodigoCurso() == codigoCurso) {

                    listaCursos.get(posicaoCurso).setProfessorTitular(novoProfessorTitular);
                    listaCursos.get(posicaoCurso).setProfessorAdjunto(novoProfessorAdjunto);

                    break Breakloop_Curso;
                }
            }
        }
    }

    public void imprimirCursos(){

        System.out.println("-> Lista de Cursos: ");

        for (Curso linhaCurso: listaCursos){
            System.out.println(
                    "  - Curso" + linhaCurso.getNome() +
                    ", codigoCurso " + linhaCurso.getCodigoCurso() +
                    ", professorTitular " + linhaCurso.getProfessorTitular() +
                    ", professorAdjunto " + linhaCurso.getProfessorAdjunto() +
                    ", qtdeMaximaAlunos " + linhaCurso.getQtdeMaximaAlunos());

            System.out.println("    - Lista de Alunos do Curso: ");

            for(Aluno linhaAluno: linhaCurso.getListaAlunosMatriculados()){
                System.out.println("    - Aluno: " + linhaAluno.toString());

            }
        }
    }

    public void atualizarMediaNotaAluno(int codigoAluno, int codigoCurso, float mediaNota){

        //Busca o curso correspondente
        for (Curso linhaCurso: listaCursos){

            if (linhaCurso.getCodigoCurso() == codigoCurso){

                //Busca o Aluno correspondente ao Curso
                for (Aluno linhaAluno: linhaCurso.getListaAlunosMatriculados()){

                    if (linhaAluno.getCodigoAluno() == codigoAluno){
                        linhaAluno.setMediaNotas(mediaNota);
                    }
                }
            }
        }
    }


}
