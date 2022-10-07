/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab4_ex1;

/**
 *
 * @author Gabriel Scopel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //@param os 3 parâmetros são os valores a serem inseridos
        int result = Matematica.max3(3, 2, 1);
        System.out.println(result);
        boolean result2 = Matematica.maioria(false, false, true);
        System.out.println(result2);
        boolean result3 = Matematica.impar(true, true, true);
        System.out.println(result3);
   }
    
}

