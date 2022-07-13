package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas");
		int n = sc.nextInt();
		double soma = 0;
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i = 0; i< vetor.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			vetor[i] =  new Pessoa(nome,idade,altura);
		}
		
	   for(int i = 0; i<vetor.length; i++){
		   
		   soma += vetor[i].getAltuta();
	   
	   }
	   int menores = 0;
	   
	   for(int i = 0; i<vetor.length;i++) {
		   if(vetor[i].getIdade() < 16) {
			   menores++;
			   System.out.println(vetor[i].getNome());
		   }
	   
	   }
	   
	   
	   
	   //Calculando a porcentagem com menosde 16 anos
	   double percentualMenores = ((double)menores / vetor.length) * 100.0;
	   double media = soma / vetor.length;
	   
	   System.out.printf("\nAltura media e: %.2f", media);
	   System.out.printf("\nPorcentagem com menos de 16 anos e  %.1f%%", percentualMenores);
	  // System.out.printf("%.s\n", menores);
	   
	   
	   int menoresNome = 0;
	   for(int i = 0; i<vetor.length;i++) {
		   if(vetor[i].getIdade() < 16) {
			   menoresNome++;
			   System.out.printf("\n%s",vetor[i].getNome());
		   }
	}

}
}

