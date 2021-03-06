package entiti;

public class Conta {

	private int number;
	private String nomeConta;
	private double saldo;

	public Conta(int number, String nome, double saldo) {
		this.nomeConta = nome;
		this.number = number;
		this.saldo = saldo;
	}

	public Conta(int number, String nome) {
		this.nomeConta = nome;
		this.number = number;

	}

	public int getNumber() {
		return number;
	}

	

	public String getNomeConta() {
		return nomeConta;
	}

	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;

	}

	public void saque(double valor) {
		this.saldo -= valor;
		this.saldo -= 5;
	}

	public String toString() {
		return "Nome: " + nomeConta + "\nConta: " + number + "\nSaldo: " + saldo;
	}

}
