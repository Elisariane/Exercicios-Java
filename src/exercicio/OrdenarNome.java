package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNome {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que armazene em um array uma lista de nomes
		 * informados pelo usuário. Em seguida, o programa deve ordenar a lista
		 * de nomes em ordem crescente (do menor para o maior). Dica: utilize a
		 * função Arrays.sort() para ordenar o array. Exemplo: Nomes informados
		 * = [willian, maria, joão, ana] Nomes ordenados = [ana, joão, maria,
		 * willian]
		 */

		//Para criar uma lista dinamica ArrayList< Objeto > nomeDoArrayList = new ArrayList< Objeto >();
		
		//Criando uma lista dinamica para inserir os nomes
		ArrayList<String> listaNomes = new ArrayList<String>();

		// Criando variaveis para o menu e interador de while
		int escolha, cont = 3;

		//Criando um objeto da classe Scanner para a entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		//Varivel string que vi guardar os nomes
		String nome;
		
		//Usando o do while
		
		do {
			//Apresentado o menu para escolher adcionar o nome e ordena-lo
			System.out.println("\n \n1- Adcionar nome na lista.");
			System.out.println("2- Ver lista ordenada.");
			System.out.println("0 - Sair...");
			System.out.println("Digite sua escolha: \n \n");
			
			//Atribuindo a escolha do usuario  a variavel escolha
			escolha = entrada.nextInt();
			
			//Caso a escolha seja 1 com o if fará a adição do nome na lista 
			if (escolha == 1) {
				//Permitindo que o usuario insira o nome
				entrada = new Scanner(System.in);
				System.out.println("\n ");
				System.out.println("Digite o nome: ");
				
				//Atribuindo a entrada de dado do usuario a varivel nome
				nome = entrada.nextLine();
				System.out.println(nome);
				
				//Adicionando o nome à listaNomes
				listaNomes.add(nome);

			} else if (escolha == 2) {
				// Caso a escolha seja 2 o else if irá mostrar a lista de nomes ordenado
				
				//Usando a classe Collections e o metodo sort para ordenar a lista
				Collections.sort(listaNomes);
				
				//Printando a lista 
				System.out.println(listaNomes.toString());
				
			} else {
				//Saindo do menu 
				System.out.println("Saindo...");
			}

		} while (cont != 0); // O while para que do funcione quando o cont for 0 irá encerrar o programa
	}

}
