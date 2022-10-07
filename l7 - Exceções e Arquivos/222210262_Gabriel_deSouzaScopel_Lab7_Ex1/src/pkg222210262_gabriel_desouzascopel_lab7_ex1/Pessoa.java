/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab7_ex1;

/**
 *
 * @author Gabriel Scopel
 * @version 1.0
 * A classe Pessoa armazena as informações de uma nova pessoa
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    //construtor, instancia um novo objeto Pessoa
    /*@param nome. armazena o novo do indivíduo
    @param sobrenome. armazena o sobrenome do indivíduo
    @param idade. armazena a idade do indivíduo
    @param cpf. armazena o cpf do indivíduo
    */
    public Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
}
