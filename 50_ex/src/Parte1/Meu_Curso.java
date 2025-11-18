package Parte1;

public class Meu_Curso {

    public String Nome;
    public String Curso;
    public int semestre;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void mostrarMensagem() {
        System.out.println("Aluno: " + this.Nome + "\nCurso: " + this.Curso + "\nSemestre: " + this.semestre);
    }

}
