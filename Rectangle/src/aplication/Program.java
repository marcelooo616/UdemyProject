package aplication;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Calculo do Retangulo");
		System.out.println("Digite a altura: ");
		retangulo.altura = sc.nextDouble();
		System.out.println("Digite a largura: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		

	}

}
