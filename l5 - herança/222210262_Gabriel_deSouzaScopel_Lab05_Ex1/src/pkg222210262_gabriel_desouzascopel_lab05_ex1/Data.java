/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab05_ex1;

/**
 *
 * @author Gabriel Scopel 
 * Classe Data. Insere os valores de dia, mês e ano de um determinada data.
 * @version 1.0
 *
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    /**
     * @param dia. Primeiro valor, correspondente ao dia.
     * @param mes. Segundo valor, correspondente ao mês.
     * @param ano. Terceiro valor, correspondente ao ano.
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //retorna o dia inserido
    public int getDia() {
        return dia;
    }
    //retorna o mes inserido
   
    public int getMes() {
        return mes;
    }
    //retorna o ano inserido
    public int getAno() {
        return ano;
    }
    //retorna o dia, mês e ano inserido serparados por "-"
    public String toString(){
        return this.getDia() + " - " +this.getMes()+ " - "+this.getAno();
    }  
}
