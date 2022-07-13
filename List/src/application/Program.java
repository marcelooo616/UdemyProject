package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// ADICIONANDO A LISTA COM O SEU TIPO QUE ESTA DENTRO DO <>
		//INSTANCIANDO A LISTA ' new ArrayList<>(); '
		
		List<String> list =  new ArrayList<>();	

		//COMANDOS DA LISTA
		
		list.add("Mardcelo");
		list.add("Gabi");
		list.add("Ester");
		list.add("Igor");
		
		
		list.add(2,"carlos");
		
		
		// COMANDO PARA VER O TAMANHO DA LISTA
		System.out.println(list.size());
		
		
		//COMANDO PARA REMOVER UM DETERMINADO DADO DA LISTA 
		//list.remove("Igor");
		/*COMANDO PARA REMOVER UM DETERMINADO DADO COM PARTE DA INFORMAÇÃO
		 * UTILIZANDO UMA INSTRUÇÃO LABDA
		*/
		//list.removeIf(x -> x.charAt(0) == 'p');
		
		///String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		//System.out.println(name);
		
		
		
		// COMANDO PARA ENCONTAR UM ELEMENTO NA LISTA
	//	System.out.println("Index of Marcelo" + list.indexOf("Marcelo"));
		
		
		for (String x : list) {
			
			System.out.println(x);
			
		}
	}

}
