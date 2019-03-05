package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class TotalPalavras {

	public static void main(String[] args) {
		/*
		 * 8) Faça um programa que, a partir de um texto digitado pelo usuário,
		 * conte o número de caracteres total e o número de palavras (palavra é
		 * definida por qualquer sequência de caracteres delimitada por espaços
		 * em branco) e exiba o resultado.
		 */
		
		//Cria-se a variavel texto para que o usuario insira seu texto
		String texto = "";
		// Criando um objeto da classe scanner para capturar a entrada do usuario
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		//atribuindo o que foi digitado para a variavel texto
		texto = input.nextLine();
		//Cria uma lista com nome de textoSeparado usando o metodo split para separar a cada espaço que encontrar
		String[] textoSeparado = texto.split(" ");
		//Usando o print para mostrar quantas palavras fazendo a contagem pelo metodo length
		System.out.println("Total de palavras digitadas: "+textoSeparado.length);
		 
		
	}
}
