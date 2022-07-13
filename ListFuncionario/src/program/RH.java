package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class RH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id = null;
		String nome = null;
		double salario = 0;
		
		List<String> list = new ArrayList<>();
		List<Double> salary = new ArrayList<>();
		
		int sizeList = 0;
		System.out.println("quantos funcio: ");
		sizeList = sc.nextInt();
		Funcionario func = new Funcionario();
		
	
		for(int i = 0; i < sizeList; i++ ) {
			System.out.println("Matricula: ");
			id = sc.next();			
			list.add(id);
			System.out.println("Nome: ");	
			nome = sc.next();
		    list.add(nome);
		    System.out.println("Salario: ");
		    salario = sc.nextDouble();
		    salary.add(salario);
		
		}
					
		

		

		  int opcao = 0;
		  System.out.println("aumenta salario?: 1 - sim");
		  opcao = sc.nextInt();
			if (opcao == 1) {
				double porcentagem = 0;
				System.out.println("Digite a porcentagem: ");
				porcentagem = sc.nextDouble();
				salario += ((porcentagem/100)*salario);
				
				int posicao = 0;
				System.out.println("Digite a matricula: ");
				posicao = sc.nextInt();
				salary.remove(posicao);
				salary.add (posicao, salario);
				
			}
			
			for (String x : list) {				
				System.out.println(x);					
			}
			for(double x: salary) {
				System.out.println(x);
			
			
	}

}
}
