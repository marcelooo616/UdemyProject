package exercicios;

import java.util.Scanner;

public class execicio_laco_condicional2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("%d e um numero PAR", numero);
			
		}else {
			System.out.printf("%d e um numero IMPAR",numero);
		}

	}

}
