package antities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double  imposto;
	public double incre;
	
	
	public double salarioLiquido() {
		double salarioliquido = salario - imposto;
		return salarioliquido;
		
	}
	
	public double almentoSalario() {
		double div = salario * (incre/100);
		double incremento = salarioLiquido() + div;
		return incremento;
	}
	
	public String toString() {
		return "Nome: " + nome 
			  +"\nSalario Bruto: " + salario
			  +"\nSalario Liquido: " + String.format("%.2f",salarioLiquido())
			  +"\nIncremento de salario: " + String.format("%.2f",almentoSalario());
			  
				
	}

}
