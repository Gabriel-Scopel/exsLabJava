/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210262_gabriel_desouzascopel_lab3_ex2;
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
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        System.out.println("Digite o nome do funcionario1: ");
        Scanner inputf1n = new Scanner(System.in);
        funcionario1.setNome(inputf1n.nextLine());
        
        System.out.println("Digite o soobrenome do funcionario1: ");
        Scanner inputf1sn = new Scanner(System.in);
        funcionario1.setSobrenome(inputf1sn.nextLine());
        
        System.out.println("Digite o salário do funcionario1: ");
        Scanner inputf1s = new Scanner(System.in);
        funcionario1.setSalario(inputf1s.nextDouble());
        
        
        System.out.println("Digite o nome do funcionario2: ");
        Scanner inputf2n = new Scanner(System.in);
        funcionario2.setNome(inputf2n.nextLine());
        
        System.out.println("Digite o soobrenome do funcionario2: ");
        Scanner inputf2sn = new Scanner(System.in);
        funcionario2.setSobrenome(inputf2sn.nextLine());
        
        System.out.println("Digite o salário do funcionario2: ");
        Scanner inputf2s = new Scanner(System.in);
        funcionario2.setSalario(inputf2s.nextDouble());
        
        
        System.out.println("Nome do funcionário1: "+ funcionario1.getNome());
        System.out.println("Sobrenome do funcionário1: "+ funcionario1.getSobrenome());
        System.out.println("Salário do funcionário1: "+ funcionario1.getSalario());
        System.out.println("Novo salário do funcionário1: "+ funcionario1.getNovoSalario());
        
        System.out.println("Nome do funcionário2: "+ funcionario2.getNome());
        System.out.println("Sobrenome do funcionário2: "+ funcionario2.getSobrenome());
        System.out.println("Salário do funcionário2: "+ funcionario2.getSalario());
        System.out.println("Novo salário do funcionário2: "+ funcionario2.getNovoSalario());
    }
    
}
