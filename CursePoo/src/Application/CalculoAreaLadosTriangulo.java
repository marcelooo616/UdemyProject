package Application;
import java.util.Scanner;

import entites.Triangle;

public class CalculoAreaLadosTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com os lados do trinagulos 'x' respectivamente A B e C: ");
		
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		
		System.out.println("Entre com os lados do trinagulos 'y' respectivamente A B e C: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
        double areax = x.area();
        double areay = y.area();
        showResult(areax);
        showResult(areay);
	
		
sc.close();
	}
	
	
	public static void showResult(double value) {
		System.out.println("A area do triangulo e: " + value);
	}
	

}
