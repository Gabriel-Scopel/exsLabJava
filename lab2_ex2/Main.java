/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab3_ex1;
import java.util.Scanner;
/**
 *
 * @author Gabriel Scopel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Retangulo ret1 = new Retangulo();
       System.out.println("Digite o valor do lado1 do retângulo1: ");
       Scanner inputr1l1 = new Scanner(System.in);
       ret1.setLado1(inputr1l1.nextInt());
       System.out.println("Digite o valor do lado2 do retângulo1: ");
       Scanner inputr1l2 = new Scanner(System.in);
       ret1.setLado2(inputr1l2.nextInt());
       
       Retangulo ret2 = new Retangulo();
       System.out.println("Digite o valor do lado1 do retângulo2: ");
       Scanner inputr2l1 = new Scanner(System.in);
       ret2.setLado1(inputr2l1.nextInt());
       System.out.println("Digite o valor do lado2 do retângulo2: ");
       Scanner inputr2l2 = new Scanner(System.in);
       ret2.setLado2(inputr2l2.nextInt());
       
       System.out.println("O lado1 do retângulo1: "+ret1.getLado1());
       System.out.println("O lado2 do retângulo1: "+ret1.getLado2());
       System.out.println("Área do retangulo1: "+ret1.area());
       System.out.println("Perímetro do retangulo1: "+ret1.perimetro());
       
       System.out.println("Área do retangulo2: "+ret2.area());
       System.out.println("Perímetro do retangulo2: "+ret2.perimetro());
       
    }
    
}
