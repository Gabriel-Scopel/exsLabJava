/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab05_ex1;

/**
 *
 * @author Gabriel Scopel
 * classe Gerente extende a Classe funcionário. 
 */
public class Gerente extends Funcionario {
    private int departamento;
    private Data promocaoGerente;
    //Construtor da classe gerente
    /*
    /* @param departamento. Corresponde a data de admissao 
     * @param promocaoGerente. Corresponde ao salario do indivíduo
     * @param admissao. Corresponde ao nome do indivíduo
     * @param salario.  Corresponde ao cpf do indivíduo
     * @param nome. Corresponde a data de nasc do usuário
     * @param cpf. Corresponde ao cpf do indivíduo
     * @param nascimento. Corresponde a data de nascimento do indivíduo
     */
    public Gerente(int departamento, Data promocaoGerente, Data admissao, double salario, int nome, double cpf, Data nascimento) {
        super(admissao, salario, nome, cpf, nascimento);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }

    //retorna o departamento do usuário
    public int getDepartamento() {
        return departamento;
    }
    @Override
    //retorna as propriedades do indivíduo, da classe Gerente e da classe Funcionario
    public String toString(){
        return this.getDepartamento() + " - " +this.promocaoGerente + " - " + super.toString() + " - " + super.getSalario();
    }
}

