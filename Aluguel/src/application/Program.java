package application;

import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Estudante[] vetor = new Estudante[10];
		System.out.println("======Aluguel de Quartos=====");
		System.out.print("Digite o numero de quartos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Quarto #" + i);
			System.out.println("Digite o nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int numeroq = sc.nextInt();
			vetor[numeroq] = new Estudante(nome, email);
		}

		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println("Numero do Quarto: " + i);
				System.out.println(vetor[i]);
			}
		}

	}

}
