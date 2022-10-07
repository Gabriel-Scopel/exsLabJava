/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab7_ex1;

import java.util.Scanner;

/**
 *
 * @author Gabriel Scopel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //obtendo dados do usuários e armazenando em suas respectivas variáveis
        System.out.println("Digite o nome: ");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Digite o sobrenome: ");
        Scanner input2 = new Scanner(System.in);
        String sobrenome = input2.nextLine();
        System.out.println("Digite a idade: ");
        Scanner input3 = new Scanner(System.in);
        int idade = input3.nextInt();
        System.out.println("Digite o cpf: ");
        Scanner input4 = new Scanner(System.in);
        String cpf = input4.nextLine();
        //detectando se o usuário digitou "-" ou "." - caracteres inválidos
        try {
            if(cpf.contains("-") || cpf.contains(".")){
                //se for detectado o caso, jogará essa exceção para ExcecaoEspecífica
                throw new ExcecaoEspecifica();
            }
            //construindo um novo objeto p
            Pessoa p = new Pessoa(nome, sobrenome, idade, cpf);
            System.out.println("cadastrado.");
        }
        //capturando um erro inesperado
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
