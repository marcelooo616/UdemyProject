package exercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	
		double pi = 3.14159, raio1 = 0, raio2 = 0,raio3 = 0;
		double resultado1 = 0,resultado2 = 0,resultado3 = 0,area1 = 0,area2 = 0,area3 = 0;
		
		
		System.out.println("Digite o valor do raio1");
	    raio1 = sc.nextDouble();
	    System.out.println("Digite o valor do raio2");
	    raio2 = sc.nextDouble();
	    System.out.println("Digite o valor do raio3");
	    raio3 = sc.nextDouble();
	    
		area1 = Math.pow(raio1, 2);
		area2 = Math.pow(raio2, 2);
		area3 = Math.pow(raio3, 2);
		
	    resultado1 = pi * area1;
	    resultado2 = pi * area2;
	    resultado3 = pi * area3;
	
	System.out.printf("valor da �rea deste c�rculo e: %.4f" ,resultado1);
	System.out.printf("\nvalor da �rea deste c�rculo e: %.4f" , resultado2);
	System.out.printf("\nvalor da �rea deste c�rculo e: %.4f" ,resultado3);
		
		
		
		

	}

}
