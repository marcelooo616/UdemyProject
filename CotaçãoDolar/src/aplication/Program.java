package aplication;

import java.util.Scanner;

import entities.conversor;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//conversor dolar = new conversor();
		
		System.out.println("Conversor Dolar");
		System.out.print("Digite a cota??o do dolar atual: ");
		double cotacaoDolar = sc.nextDouble();
		System.out.print("Digite o valor em dolar: ");
		double Dolar = sc.nextDouble();
		
		double Real = conversor.Converter(cotacaoDolar,Dolar);
		double iof = Real * (conversor.IOF/100);
		System.out.printf("Com IOF de %.2f = %.2f ", conversor.IOF,iof );
		System.out.printf("\nValor total da conver??o para Real  = %.2f" , Real  );
		

	}

}
