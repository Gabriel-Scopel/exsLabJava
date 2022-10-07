/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab3_ex3;


/**
 *
 * @author Gabriel Scopel
 */
public class MonitorCardiaco {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int anoNasc;
    

    public MonitorCardiaco(String nome, String sobrenome, int dia, int mes, int anoNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int idade(){
        return 2022-anoNasc;
    }
    
    public double freqMax(){
        return 220-(2022-anoNasc);
    }
    public double freqAlvo1(){
        return 220-(2022-anoNasc)/2;
    }
    public double freqAlvo2(){
        return 220-(2022-anoNasc)/1.176470588235294;
    }


    
   
}
