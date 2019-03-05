package exercicio;


import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
					
			/*
	         * Escreva um método que receba por parâmetro um nome e retorne as
	         * letras do nome que são vogais. Dica: utilize o método toCharArray()
	         * da String .
	         */
			
		//Criando uma lista de números inteiros
				int[] lista;
				//Determinando o tamanho da lista
				lista = new int[5];
				
				//Criando um objeto da classe Scanner para a entrada de dados
				Scanner input = new Scanner(System.in);
				
				//Pedindo para o usuario inserir números no vetor
				System.out.println("Insira 5 números inteiros no vetor: ");
				
				//Atribuindo a cada posição
				lista[0] = input.nextInt();
				lista[1] = input.nextInt();
				lista[2] = input.nextInt();
				lista[3] = input.nextInt();
				lista[4] = input.nextInt();
	       
	        PrimeiraPosicao.pegarposicao(lista);
}
}