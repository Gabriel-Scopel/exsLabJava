/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab05_ex1;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Scopel
 * classe principal, em que criamos os ArrayLists de Funcionario e Gerente.
 * Adiciona objetos a aos ArrayLists e retorna o método correspondente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia um ArraList de funcionario
        ArrayList <Funcionario> f = new ArrayList <> ();
        //Adiciona um novo indivíduo ao ArrayList previamente criado
        f.add(new Funcionario(new Data(1,1,1), 0, 0, 0, new Data(1,1,1)));
        //instancia um ArraList de Gerente
        ArrayList <Gerente> g = new ArrayList <> ();
        //Adiciona um novo gerente ao ArrayList previamente criado
        g.add(new Gerente(0, new Data(1,1,1), new Data(1,1,1), 0, 0, 0, new Data(1,1,1)));
        //printa o método toString armazenado no ArrayList 
        System.out.println(f.toString()); 
        System.out.println(g.toString());
        
        
    }
    
}
