package entities;

public class Retangulo {
	
	public double largura;
    public double altura;
    // para calcular a area de um reatngulo use a formula a = b * a ou  area =  base * altura
    public double Area(){
    	double result = largura * altura;
    	return result;
    }
    public double Perimetro() {
    	
    	double result = 2 * (largura + altura);
    	return result;
    	   	
    }
    public double Diagonal() {
    	
    	double result =  Math.pow(largura, 2) + Math.pow(altura, 2);
    	result = Math.sqrt(result);
		return result;
    	
    }
    
    public String toString() {
    	return "Area: " + String.format("%.2f", Area())
    	      +"\nPerimetro: " + String.format("%.2f", Perimetro())
    	      +"\nDiagonal: " + String.format("%.2f", Diagonal());
    }
    
}
