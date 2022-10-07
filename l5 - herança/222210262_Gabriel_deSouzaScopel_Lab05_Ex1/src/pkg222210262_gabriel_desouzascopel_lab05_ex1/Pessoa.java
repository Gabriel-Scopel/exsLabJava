/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab05_ex1;

/**
 *
 * @author Gabriel Scopel
 * classe Pessoa. Armazena as propriedades de um novo indivíduo.
 */
public class Pessoa {
    
    private int nome;
    private double cpf;
    private Data nascimento;
    //construtor. Instancia um novo objeto do tipo Pessoa
    /*
    @param nome. Corresponde ao nome da pessoa
    @param cpf. Corresponde ao cpf da pessoa
    @param nascimento. Corresponde a data de nascimento da pessoa
    */
    public Pessoa(int nome, double cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
    //retorna o nome do indivíduo
    public int getNome() {
        return nome;
    }
    //retorna os valores armazenados nas propriedades da classe Pessoa
    public String toString(){
        return this.getNome() + " - " +this.cpf+ " - "+this.nascimento;
    }
    
          
}
