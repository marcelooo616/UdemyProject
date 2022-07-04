package exercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		int a, b;
		int resultado;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Soma de Valores!!");
		System.out.println("Digite os valores de a e b: ");
	    a = sc.nextInt();
	    b = sc.nextInt();
	    
	    resultado = a + b;
	    
		System.out.println("SOMA: " + resultado);
	
		

	}

}
