/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_dsouzascopel_lab3_ex1;

/**
 *
 * @author Gabriel Scopel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d1 = new Data(9, 9, 2022);
        System.out.println(d1.getMM()+"/"+d1.getDD()+"/"+d1.getYYYY());
        
        Data d2 = new Data("Setembro", 9, 2022);
        System.out.println(d2.getData()+" "+d2.getDia()+","+d2.getAno());
        
        Data d3 = new Data(0, 0);
        System.out.println(d3.getDDD()+" "+d3.getYYYY2());
    }
    
}
