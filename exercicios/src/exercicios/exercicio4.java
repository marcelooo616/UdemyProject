package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int matricula = 0, horas = 0;
		double salario = 0, resultado = 0;
		
		Scanner sc=  new Scanner(System.in);
		System.out.print("Digite sua matricula: ");
        matricula = sc.nextInt();
        System.out.println("Digite suas horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.println("valor por hora: ");
        salario = sc.nextDouble();
        
        resultado  = salario * horas;
        
        System.out.println("Matricula : " + matricula);
        System.out.println("Salario: " + resultado);
        
        
		
		

	}

}
