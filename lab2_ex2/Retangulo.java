/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab3_ex1;

/**
 *
 * @author Gabriel Scopel
 */
public class Retangulo {
    private int lado1;
    private int lado2;
    
    public int getLado1(){
        return this.lado1;
    }
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
   
    public int getLado2(){
        return this.lado2;
    }
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    
    public double area(){
        return lado1*lado2;
    }
    
    public double perimetro(){
        return lado1*2+lado2*2;
    }
    
}
