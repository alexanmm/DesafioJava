package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor{

    //Atributos
    private int qtdeHrMonitoria;

    //Construtor
    public ProfessorAdjunto() {

    }

    public ProfessorAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor, int qtdeHrMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.qtdeHrMonitoria = qtdeHrMonitoria;
    }

    //Getter and Setter
    public int getQtdeHrMonitoria() {
        return qtdeHrMonitoria;
    }

    public void setQtdeHrMonitoria(int qtdeHrMonitoria) {
        this.qtdeHrMonitoria = qtdeHrMonitoria;
    }


    //Metodos
    @Override
    public String toString() {
        return "ProfessorAdjunto{" +
                "qtdeHrMonitoria=" + qtdeHrMonitoria +
                '}';
    }
}
