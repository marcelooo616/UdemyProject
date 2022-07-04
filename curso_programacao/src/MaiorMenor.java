import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Entre com tres numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int maior = max(a,b,c);
		int maior2 = max(d,e,f);
		
		showResult(maior);
		showResult(maior2);

		sc.close();
	}
	// criando função
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z ) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
		
	}
	public static void showResult(int value) {
		
		System.out.println("maior: " + value);
	}

}
