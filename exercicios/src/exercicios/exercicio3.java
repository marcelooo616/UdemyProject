package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int A,B,C,D;
		int DIFERENCA;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de A B C e D : ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        DIFERENCA = (A * B - C * D);
        System.out.println("A diferenca dos falores A B C e D e: " + DIFERENCA);
        
	}

}
