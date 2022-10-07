/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab7_ex2;

import java.util.Random;

/**
 * @author Gabriel Scopel
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private int id;
    /*
    * Instancia um objeto Pessoa.
     *
     * @param nome. Nome do indivíduo.
     * @param telefone. Telefone do indivíduo
     * @param id. Id gerado automaticamente de maneira aleatória
     */

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        Random generator = new Random();
        this.id = generator.nextInt(1,100000);
    }
    /**
     * Recupera o nome do indivíduo.
     * @return nome do indivíduo.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Recupera o telefone do indivíduo.
     * @return telefone do indivíduo.
     */

    public String getTelefone() {
        return telefone;
    }
    /**
     * Recupera o id do indivíduo.
     * @return id do indivíduo.
     */
    public int getId() {
        return id;
    }

    
}
