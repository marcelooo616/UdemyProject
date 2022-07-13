package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altuta;
	
	public Pessoa(String nome, int idade, double altuta) {


		this.nome = nome;
		this.idade = idade;
		this.altuta = altuta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltuta() {
		return altuta;
	}
	public void setAltuta(double altuta) {
		this.altuta = altuta;
	}
	
	

}
