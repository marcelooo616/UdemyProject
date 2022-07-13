package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de Funcionarios: ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, nome, salary);

			list.add(emp);
		}
		
        System.out.println();
		System.out.println("Entre com o employee para faze o incremento: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);

		if (pos == null) {
			System.out.println("Este Id não existe!");
		} else {
			System.out.print("Qual a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}

		System.out.println();
		System.out.println("Lista de Funcionarios:");
		for (Employee amp : list) {

			System.out.println(amp);
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

}
