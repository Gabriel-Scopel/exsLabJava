/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabrieldesouzascopel_lab6_ex1;

/**
 *
 * @author Gabriel Scopel
 * classe Area é responsável por calcular a área de um quadrado ou de um retângulo
 */
public class Area {
    /*método calcArea. Retorna o valor da área
    @param comprimento. corresponde ao valor do comprimento 
    @param largura. corresponde ao valor da largura
    */
    public double calcArea(double comprimento, double largura){
        return comprimento*largura;
    }
    /*método calcArea. corresponde a uma sobrecarga. também retorna o valor da área mas possui um único parâmetro
    @param comprimento. corresponde ao valor do comprimento 
    */
    public double calcArea(double lado){
        return lado*lado;
    }
}
