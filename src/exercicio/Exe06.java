package exercicio;

import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args){
		
		//Criando um objeto da classe NumeroExtenso
		NumeroExtenso  numExtenso = new NumeroExtenso();
		
		//Variavel de numero inteiro
		int numero;

		//Criando um objeto da classe Scanner para a entrada de dados
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite qualquer número: ");
		
		//Atribuindo  o numero digitado a varivel número
		numero = entrada.nextInt();
		
		//Apresentando o número extenso vindo do metodo extenso
		System.out.println(numExtenso.extenso());
		
		
		
	}

}
