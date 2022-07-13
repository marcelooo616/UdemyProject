package application;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de produtos!");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		double soma = 0;
		
		for(int i =0;i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine(); 
			double valor =  sc.nextDouble();
			vect[i] = new Produto(name,valor);
		   
		   
		}
		
		for(int i = 0; i < vect.length; i++) {			
			 soma += vect[i].getValor();			
		}
		double media = soma / vect.length;
		
		System.out.printf("Media dos Produtos e: %.2f", media);
	
		
		
		
		
    sc.close();
	}

}
