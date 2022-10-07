/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab7_ex2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Gabriel Scopel
 * @version 1.0
 * 
 */
public class Main {
    
    //menu que apresenta as opções ao usuário
    public static void menu(){
        System.out.println("\tCadastro");
        System.out.println("0. Sai do programa");
        System.out.println("1. Nova Entrada");
        System.out.println("2. Exclui");
        System.out.println("3. Imprime");
        System.out.println("Opcao:");
    }
    //responsável por escrever no arquivo 
    public static void inclui(){
        //instancia um arraylist p do tipo pessoa
        ArrayList <Pessoa> p = new ArrayList <>();
        System.out.println("Você entrou no método nova entrada.");
        //armazena as informações do usuário em cada variável correspondente
        String nome;
        String telefone;
        System.out.println("Digite o nome: ");
        Scanner inputNome = new Scanner(System.in);
        nome = inputNome.nextLine();
        System.out.println("Digite o telefone: ");
        Scanner inputTelefone = new Scanner(System.in);
        telefone = inputTelefone.nextLine();
        //adiciona as informações do usuário no arraylist
        p.add(new Pessoa(nome, telefone));
        
        //cria um novo arquivo dentro do try caso não haja erro, caso haja, ele printa o stracktrace da exceção
        try {
            //cria o arquivo
            FileWriter arquivo = new FileWriter("ind.txt", true);
            PrintWriter escritaArquivo = new PrintWriter(arquivo);
            //escreve as informações do arquivo
            escritaArquivo.write(nome);
            escritaArquivo.write(" --> ");
            escritaArquivo.write(telefone);
            escritaArquivo.write(" | ");
            arquivo.close();
                    
        } catch (Exception e) {
            //printa a exceção
            e.printStackTrace();
        }
        
    }
    
    public static void exclui(){
        System.out.println("Você entrou no método Exclui.");
    }
    //responsável por fazer a impressão dos dados do arquivo
    public static void consulta(){
        System.out.println("Você entrou no método Imprime.");
        
        try {
            //pegando o arquivo
            FileReader arquivo = new FileReader("C:\\Users\\Gabriel Scopel\\Documents\\NetBeansProjects\\222210262_Gabriel_deSouzaScopel_Lab7_Ex2/ind.txt");
            BufferedReader br = new BufferedReader(arquivo);
            ArrayList <String> ind = new ArrayList<>();
            String str;
            //enquanto as linhas do arquivo não forem zeradas, ele continua imprimindo 
            while((str = br.readLine()) != null){
                ind.add(str);
                System.out.println(str);
            }
            //printa a exceção
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    //capta a opção do usuário e encaminha para a opção desejada
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                inclui();
                break;
                
            case 2:
                exclui();
                break;
                
            case 3:
                consulta();
                break;
               
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
