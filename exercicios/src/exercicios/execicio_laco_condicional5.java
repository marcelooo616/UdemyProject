package exercicios;

import java.util.Scanner;

public class execicio_laco_condicional5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String menu;
	    
	    
	    int opcao1 = 0, opcao2 = 0;
	    
	    double HotDog = 4.00;
	    double XSalada = 4.5;
	    double XBacon = 4.00;
	    double TorradaSimples = 4.00;
	    double dc = 4.00;
	    System.out.println("escolha ");
	    opcao1 =sc.nextInt();
	    opcao2 =sc.nextInt();
	    
	    if (opcao1 == 3 && opcao2 == 2) {
	    	double resultado = 0;
	    	
	    	resultado = HotDog + XSalada;
	    	System.out.printf("Opções %d e %d totalizando %.2f", opcao1,opcao2,resultado);
	    	
	    }

	}

}
