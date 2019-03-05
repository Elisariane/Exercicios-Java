package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class InicialNome {
	
	
	public static void main(String[] args){
		/*
		 * 7) Escreva um programa que, a partir de um nome informado pelo usuário,
		 * exiba suas iniciais. As iniciais são formadas pela primeira letra de cada
		 * nome, sendo que todas deverão aparecer em maiúsculas na saída do programa
		 * . Note que os conectores e, do, da, dos, das, de, di, du não são
		 * considerados nomes e, portanto, não devem ser considerados para a
		 * obtenção das iniciais. As iniciais devem ser impressas em maiúsculas,
		 * ainda que o nome seja entrado todo em minúsculas. Exemplos: Maria das
		 * Graças Pimenta => MGPJoão Carlos dos Santos => JCS José da Silva => JS
		 * Pedro Pereira Teixeira => PP
		 */

		
		// Criando um objeto da classe scanner para capturar a entrada do usuario
		Scanner input = new Scanner(System.in);
		
		String nome;
		
		
		//Pedindo para o usuario informar o nome
		System.out.print("Informe seu nome completo: ");
		
		//Atribuindo os dados que foram digitados à variavel nome e colocando todas em maisculo
		nome = input.nextLine().toUpperCase();
		
		//Print das iniciais
		
		System.out.print("Iniciais do Nome: ");
		
		//Esse metodo retorna um char no índice especificado, no caso na posição 0
		System.out.print(nome.charAt(0));
		
		//Um for para pegar as posições
		for (int i = 0; i < nome.length(); i++) {
			
			//Se a posição i for vazia print o nome na posição i +1
			if (nome.charAt(i) == ' ') {
				System.out.print(nome.charAt(i + 1));
			}
		}
		
		
	}
	
	
}
