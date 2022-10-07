/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab4_ex1;

/**
 *
 * @author Gabriel Scopel
 * Classe Matematica. Realiza as operações max3, impar e maior.
 * @version 1.0
 */

public class Matematica {
    private static int n1;
    private static boolean b;
    public static int i;
    
    /**
     * Instancia um objeto Matematica.
     *
     * @param v1. Primeiro valor.
     * @param v2. Segundo valor.
     * @param v3. Terceiro valor.
     */
   
    //Em max3 retorna o maior entre 3 valores
    public static int max3(int v1, int v2, int v3){
  
        if(v1>v2 && v2>v3){
            n1 = v1;
        }
        else if(v1>v3 && v3>v2){
            return v1;
        }
        else if(v2>v3 && v1>v3){
            return v2;
        }
        else if(v2>v3 && v3>v1){
            return v2;
        }
        else if(v3>v2 && v2>v1){
            return v3;
        }
        else if(v3>v1 && v1>v2){
            return v3;
        }
  
        return n1;
    }
    
    //Em impar recebe três entradas booleanas e retorna verdadeiro se um número ímpar de entradas for true e falso caso contrário.
    public static boolean impar(boolean v1, boolean v2, boolean v3){
        if(v1 != false && v2 == true && v3 == true){
            b = true;
        }
        else if(v2 != false && v3 == true && v1 == true){
            b = true;
        }
        else if(v3 != false && v1 == true && v2 == true){
            b = true;
        }
        else if(v1 == true && v2 == true && v3 == true){
            b = true;
        }
        else{
            b = false;
        }
        
        return b;
    }
    //Em maioria recebe três argumentos booleanos e retorna verdadeiro se pelo menos dois dos argumentos tiverem o valor true e falso caso contrário.
    public static boolean maioria(boolean v1, boolean v2, boolean v3){
        return Boolean.logicalOr(Boolean.logicalAnd(v1, v2), Boolean.logicalAnd(v2,v3));
    }
    
    
    
}
