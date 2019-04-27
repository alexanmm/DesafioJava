package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        //1. Criar uma classe Principal e um método main.
        //2. Registrar dois professores titulares e dois professores adjuntos. (Inventar
        //todos os seus valores)
        //3. Registrar dois cursos.
        //○ Nome do curso: Full Stack
        //Código do curso: 20001
        //Quantidade máxima: 3
        //○ Nome do curso: Android
        //Código do curso: 20002
        //Quantidade máxima: 2
        //4. Alocar um professor titular e um adjunto para cada curso.
        //5. Matricular dois alunos no curso de Full Stack.
        //6. Matricular três alunos no curso de Android.

        //Inicializar Professores Titulares
        ProfessorTitular profTitularAlan = new ProfessorTitular("Carlos", "Silva", 10, 5001, "Java, Android");
        ProfessorTitular profTitularCarlos = new ProfessorTitular("Carlos", "Mendes", 5, 4504, "Full Stack, .Net, Visual Basic");

        //Inicializar Professores Adjuntos
        ProfessorAdjunto profAdjuntoElias = new ProfessorAdjunto("Elias", "Neto", 10, 5001, 40);
        ProfessorAdjunto profAdjuntoJoao = new ProfessorAdjunto("João", "Santos", 5, 4504, 30);

        //Inicializar dois cursos
        Curso cursoFullStack = new Curso("FrullStack", 20001, 3);
        Curso cursoAndroid = new Curso("Android", 20002, 2);

        //Alocar um professor titular e um adjunto para cada curso.
        cursoFullStack.setProfessorTitular(profTitularCarlos);
        cursoFullStack.setProfessorAdjunto(profAdjuntoJoao);

        cursoAndroid.setProfessorTitular(profTitularAlan);
        cursoAndroid.setProfessorAdjunto(profAdjuntoElias);

        //Matricular dois alunos no curso de Full Stack.
        Aluno alunoRenan = new Aluno("Renan", "Pires", 3001);
        Aluno alunoPaulo = new Aluno("Paulo", "Roberto", 3002);

        cursoFullStack.adicionarUmAluno(alunoRenan);
        cursoFullStack.adicionarUmAluno(alunoPaulo);

        //Matricular três alunos no curso de Android.
        Aluno alunaAna = new Aluno("Ana", "Paula", 5051);
        Aluno alunaClaudia = new Aluno("Claudia", "Maria", 5052);
        Aluno alunoSergio = new Aluno("Sergio", "Brito", 5056);

        cursoAndroid.adicionarUmAluno(alunaAna);
        cursoAndroid.adicionarUmAluno(alunaClaudia);
        cursoAndroid.adicionarUmAluno(alunoSergio);

        //Exibição dos dados dos Cursos na Tela
        System.out.println(" -> Dados do curso Android: "
                + "\n" + cursoAndroid.toString());

        System.out.println(" -> Dados do curso Full Stack: "
                + "\n" + cursoFullStack.toString());


    }

}
