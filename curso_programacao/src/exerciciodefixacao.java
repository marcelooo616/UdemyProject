
public class exerciciodefixacao {

	public static void main(String[] args) {
		/* %f = ponto flutuante
		   %d = inteiro
	       %s = texto
	       %n = quebra de linha */
		
		String produto1 = "computer";
		String produto2 = "office desk";
		
		int age = 30;
		int code = 5299;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s , which price is R$ %.2f", produto1,price1);
		System.out.printf("\n%s, which price is R$ %.2f ", produto2,price2);
		System.out.printf("\n%d years old, code %d and gender: %s", age,code,gender);
	 	System.out.printf("\nMeasue with eight decimal places: %.8f", measure);
        System.out.printf("\nRounded (theree decimal places): %.3f", measure);
        System.out.printf("\nUS decimal: %.3f", measure);
	}

}
