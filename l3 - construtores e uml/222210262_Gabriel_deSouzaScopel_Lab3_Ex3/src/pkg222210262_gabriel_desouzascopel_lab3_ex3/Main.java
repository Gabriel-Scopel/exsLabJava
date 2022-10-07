/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab3_ex3;

/**
 *
 * @author Gabriel Scopel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MonitorCardiaco m1 = new MonitorCardiaco("Gabriel", "Scopel", 23, 3, 1998);
        System.out.println(m1.idade());
        System.out.println(m1.freqMax());
        System.out.println(m1.freqAlvo1()+" - "+m1.freqAlvo2());
        
        
    }
    
}
