/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab7_ex1;



/**
 *
 * @author Gabriel Scopel
 * a classe tem por função informar uma exceção específica: caso o cpf possuir hífer ou ponto 
 */
public class ExcecaoEspecifica extends Exception {
    
    //informa que o cpf é inválido
    @Override
    public String toString(){
        return "o cpf não pode conter hífer ou ponto";
    }
    
}
