package aplication;

import java.util.Scanner;

import entiti.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Conta bancaria");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Numero da Conta: ");
		int numero = sc.nextInt();
		
		
		//System.out.print("Quer fazer um deposito?(s/n): ");
		//char dep = sc.next().charAt(0);
		
		System.out.println("1 - DEPOSITO");
		System.out.println("2 - SAQUE + Taxa = R$ 5,00");
		System.out.println("3 - SAIR");
		System.out.print("DIGITE A OP��O: ");
		Conta conta = new Conta(numero, nome);
		int opcao = sc.nextInt();
		
	
		
		switch (opcao) {
		case 1:			
			System.out.print("Valor para Deposito: ");
			double deposito = sc.nextDouble();
			conta.deposito(deposito);
			System.out.println(conta);
			
			
			System.out.println("1 - DEPOSITO");
			System.out.println("2 - SAQUE + Taxa = R$ 5,00");
			System.out.println("3 - SAIR");
			System.out.print("DIGITE A OP��O: ");			
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				
				System.out.print("Valor para Deposito: ");
				double deposito2 = sc.nextDouble();
				conta.deposito(deposito);
				System.out.println(conta);	
				
			}else if(opcao == 2) {
				
				System.out.print("Valor para Saque: ");
				double saque = sc.nextDouble();
				conta.saque(saque);
				System.out.println(conta);
				
			}else if(opcao == 3) {
				System.out.println("Segue a baixo os dados da sua conta!");
				System.out.println(conta);
				System.out.println("Obrigado e volte sempre!!");
			}
			break;
			
		case 2:
			
			if (conta.getSaldo() == 0) {
				System.out.println("Saque indisponivel!! ");
				System.out.println("Saldo: " + conta.getSaldo());
				System.out.println("Faca um Deposito antes para poder sacar!!");
				
				System.out.println("Quer fazer um deposito?(s/n)");
				char dep = sc.next().charAt(0);
				
				if(dep == 's') {
					
					System.out.print("Valor para Deposito: ");
					double saque = sc.nextDouble();
					conta.deposito(saque);
					System.out.println(conta);
					
					System.out.println("Quer fazer um saque?(s/n)");
					char saq = sc.next().charAt(0);
					
					if(saq == 's') {
						
						System.out.print("Digite o valor para saque: ");
						double valor = sc.nextDouble();
						conta.saque(valor);
						System.out.println("Obrigado e volte sempre!!");
						System.out.println("Segue a baixo os dados da sua conta!");
						System.out.println(conta);
						System.out.println("Obrigado e volte sempre!!");
						
						
					}else {
						
						System.out.println("Segue a baixo os dados da sua conta!");
						System.out.println(conta);
						System.out.println("Obrigado e volte sempre!!");
						
					}
					
					
				}else {
					System.out.println("Segue a baixo os dados da sua conta!");
					System.out.println(conta);
					System.out.println("Obrigado e volte sempre!!");
				}
				
			}
			else {
				
				System.out.print("Digite o valor para saque: ");
				double valor = sc.nextDouble();
				conta.saque(valor);
				System.out.println("");
				
			}
			
			break;
		case 3:
			System.out.println("Segue a baixo os dados da sua conta!");
			System.out.println(conta);
			System.out.println("Obrigado e volte sempre!!");
			
			
		
		
		}
		
		
	}

}
