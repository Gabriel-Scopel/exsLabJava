/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab05_ex1;

/**
 *
 * @author Gabriel Scopel
 *  * Classe Funcionario. Extende a classe Pessoa, possuindo como propriedades próprias admissao e salario.
 * @version 1.0
 */
public class Funcionario extends Pessoa{
    private Data admissao;
    private double salario;
    //construtor settando as propriedades da própria classe e da classe que ela herda
    /* @param admissao. Corresponde a data de admissao 
     * @param salario. Corresponde ao salario do indivíduo
     * @param nome. Corresponde ao nome do indivíduo
     * @param cpf.  Corresponde ao cpf do indivíduo
     * @param nascimento. Corresponde a data de nasc do usuário
     */
    public Funcionario(Data admissao, double salario, int nome, double cpf, Data nascimento) {
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }
    //retorna o salário
    public double getSalario() {
        return salario;
    }
    //retorna os valores formatados da própria classe e da classe que ela herda
    @Override
    public String toString(){
        return this.admissao + " - " +this.salario + " - " + super.getNome() + super.toString();
    }
    
}
