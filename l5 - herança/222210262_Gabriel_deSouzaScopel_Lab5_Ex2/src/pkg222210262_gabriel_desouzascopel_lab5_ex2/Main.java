/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab5_ex2;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
/**
 *
 * @author Gabriel Scopel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    /*menu criado para criar um arraylist de Pessoa, com as opções de adicionar um novo registro,
    apagar registro existente e imprimir todos os registros*/
    
    
    public static void main(String[] args) {
        ArrayList <Pessoa> p = new ArrayList <>();
        
        while(true){
            System.out.println("Entre com uma das seguintes opções: ");
            System.out.println("n [nova entrada]");
            System.out.println("d [apagar registro da agenda]");
            System.out.println("p [imprimir toda agenda]");
            System.out.println("q [sair do programa]");
            String b;
            try{
                Scanner sc1 = new Scanner(System.in);
                b = sc1.nextLine();
            }catch (InputMismatchException exception) {
                System.out.println("Caracter inserido inválido!");
                continue;
            }
            if (b == "q") {
                System.out.println("Programa finalizado!");
                break;
                
            } else {
                switch (b) {
                    
                case "n":
                    System.out.println("nova entrada!");
                    String nome;
                    String telefone;
                    System.out.println("Digite o nome: ");
                    Scanner inputNome = new Scanner(System.in);
                    nome = inputNome.nextLine();
                    System.out.println("Digite o telefone: ");
                    Scanner inputTelefone = new Scanner(System.in);
                    telefone = inputTelefone.nextLine();
                    
                    p.add(new Pessoa(nome, telefone));
          
                    break;
                case "d":
                    System.out.println("apagar registro");
                    String nomeDel;
                    Scanner inputDel = new Scanner(System.in);
                    nomeDel = inputDel.nextLine();
                    
                    for(int i=0; i<p.size();i++){
                        Pessoa p1 = p.get(i);
                        if(p1.getNome().equals(nomeDel)){
                            p.remove(p1);
                            break;
                        }
                    }
                    
                    
                    break;
                case "p":
                    System.err.println("Imprimir toda agenda");
                    ;
                    for(int i=0; i<p.size(); i++){
                        System.out.println(p.get(i).getNome());
                        System.out.println(p.get(i).getTelefone());
                        System.out.println("");
                    }
                    
                case "q":
                    break;
                default:
                    System.out.println("Opção invalida");
                }
            }
        }
        
    
    }
    
}
