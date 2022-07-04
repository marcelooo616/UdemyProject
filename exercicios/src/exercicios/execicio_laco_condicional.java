package exercicios;

import java.util.Scanner;

public class execicio_laco_condicional {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.printf("%d e um numero negativo ", numero);
		}else {
			System.out.printf("%d e um numero positivo ", numero);
		}

	}

}
