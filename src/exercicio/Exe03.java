package exercicio;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {

		// Criando um objeto da classe VerificaVogal(que está feita nesse mesmo
		// pacote)
		VerificaVogal confere = new VerificaVogal();

		// Criando um objeto da classe Scanner para a entrada de dados
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");

		// Atribuindo os dados digitados pelo usuario à variavel nome
		String nome = input.next();

		// Usando o metodo criado na classe VerificaVogal para obter o retorno
		String result = confere.confereVogal(nome);

		// Print mostrando as variaveis
		System.out.println(result);
	}
}