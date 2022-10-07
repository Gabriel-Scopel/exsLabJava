/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_dsouzascopel_lab3_ex2;

/**
 *
 * @author Gabriel Scopel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor p1 = new Professor("nomeprof", "departamento");
        Disciplina d1 = new Disciplina("codigo", "nomedisc");
        Aluno a1 = new Aluno("nomealuno", "RA", "Curso", d1, p1);
        
        a1.getD1();
        a1.getP1();

        //O método escolhido foi de Agregação: na classe aluno temos propriedade do tipo Disciplina e do tipo Professor
    }
    
}
