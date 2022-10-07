/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_dsouzascopel_lab3_ex1;

/**
 *
 * @author Gabriel Scopel
 */
public class Data {
    private int MM;
    private int DD;
    private int YYYY;
    
    public Data(int MM, int DD, int YYYY ){
        this.MM = MM;
        this.DD = DD;
        this.YYYY =YYYY;
    }
    
    private String data;
    private int dia;
    private int ano;
    
    public Data(String data, int dia, int ano){
        this.data = data;
        this.dia = dia;
        this.ano = ano;
    }

    public int getMM() {
        return MM;
    }

    public int getDD() {
        return DD;
    }

    public int getYYYY() {
        return YYYY;
    }

    public String getData() {
        return data;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public int getDDD() {
        return DDD;
    }

    public int getYYYY2() {
        return YYYY2;
    }
    
    private int DDD;
    private int YYYY2;
    public Data(int DDD, int YYYY2){
        this.DDD = DDD;
        this.YYYY2=YYYY2;
    }
}
