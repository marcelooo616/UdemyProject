package aplication;

import java.util.Scanner;

import antities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Salario do Funcionario");
		System.out.println("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		funcionario.salario = sc.nextDouble();
		System.out.println("Imposto: "); 
        funcionario.imposto = sc.nextDouble();
        
        System.out.println("incremento de Salario: ");
        funcionario.incre = sc.nextDouble();
        
        System.out.println(funcionario);
        

	}

}
