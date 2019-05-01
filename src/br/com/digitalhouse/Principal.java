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

        //Incializar Digital House
        DigitalHouseManager digitalHouse = new DigitalHouseManager();

        //Inicializar Professores Titulares
        digitalHouse.registrarProfessorTitular("Carlos", "Silva", 5001, "Java, Android");
        digitalHouse.registrarProfessorTitular("Pablo", "Mendes", 5002, "Full Stack, .Net, Visual Basic");

        //Inicializar Professores Adjuntos
        digitalHouse.registrarProfessorAdjunto("Elias", "Neto", 6001, 40);
        digitalHouse.registrarProfessorAdjunto("João", "Santos", 6002, 30);

        //Inicializar dois cursos
        digitalHouse.registrarCurso("FullStack", 20001, 30);
        digitalHouse.registrarCurso("Android", 20002, 15);

        //Alocar um professor titular e um adjunto para cada curso.
        digitalHouse.alocarProfessores(20001, 5002, 6001);
        digitalHouse.alocarProfessores(20002, 5001, 6002);

/*
        digitalHouse.excluirCurso();
        digitalHouse.excluirProfessor();
*/

        //Matricular dois alunos no curso de Full Stack.
        digitalHouse.matricularAluno("Renan", "Pires", 3001);
        digitalHouse.matricularAluno(3001, 20001);

        digitalHouse.matricularAluno("Paulo", "Roberto", 3002);
        digitalHouse.matricularAluno(3002, 20001);

        //Matricular três alunos no curso de Android.
        digitalHouse.matricularAluno("Ana", "Paula", 5051);
        digitalHouse.matricularAluno(5051, 20002);

        digitalHouse.matricularAluno("Claudia", "Maria", 5052);
        digitalHouse.matricularAluno(5052, 20002);

        digitalHouse.matricularAluno("Sergio", "Brito", 5056);
        digitalHouse.matricularAluno(5056, 20002);

        //Exibição dos dados dos Cursos na Tela
        digitalHouse.imprimirCursos();

    }

}
