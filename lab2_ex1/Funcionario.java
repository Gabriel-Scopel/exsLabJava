/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab3_ex2;

/**
 *
 * @author Gabriel Scopel
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;
    private double novoSalario;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSalario(double salario){
        if(salario >0 ){
            this.salario = salario;
            this.novoSalario = salario+salario*0.1;
        }else{
        this.salario = 0;
        }
    }
    public double getSalario(){
        return this.salario;
    }
    
    public double getNovoSalario(){
        return this.novoSalario;
    }
}
