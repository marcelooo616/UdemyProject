package exercicios;

import java.util.Scanner;

public class exercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de x:> ");
		int x = sc.nextInt();
        int imp =  0; 		
		for(int i =0; i <= x; i++) {
			//System.out.println(i++); uma forma de exibir os numeros pares
			if (i % 2 > 0) {
				System.out.println(i);
			}
		}
        
	}

}
