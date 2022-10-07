/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_dsouzascopel_lab3_ex2;

/**
 *
 * @author Gabriel Scopel
 */
public class Aluno {
    private String nome;
    private String RA;
    private String Curso;
    private Disciplina d1;
    private Professor p1;

    public Aluno(String nome, String RA, String Curso, Disciplina d1, Professor p1) {
        this.nome = nome;
        this.RA = RA;
        this.Curso = Curso;
        this.d1 = d1;
        this.p1 = p1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public Disciplina getD1() {
        return d1;
    }

    public void setD1(Disciplina d1) {
        this.d1 = d1;
    }

    public Professor getP1() {
        return p1;
    }

    public void setP1(Professor p1) {
        this.p1 = p1;
    }

    

   
    
    
}
