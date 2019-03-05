package exercicio;

import java.util.Scanner;

public class ManipulandoString {
	public static void main(String[] args) {
		/*
		* FaÃ§a um programa que, a partir de uma string digitada pelo usuÃ¡rio,
		* imprima: a) O nÃºmero de caracteres da string. b) A string com todas suas
		* letras em maiÃºsculo. c) O nÃºmero de vogais da string. d) Se a string
		* digitada comeÃ§a com â€œIFâ€� (ignorando maiÃºsculas/minÃºsculas). e) Se a
		* string digitada termina com â€œPRâ€� (ignorando maiÃºsculas/minÃºsculas). f)
		* O nÃºmero de dÃ­gitos (0 a 9) da string. g) Se a string Ã© um palÃ­ndromo ou
		* nÃ£o.
		*/

		int vogal = 0;
		String palavra;
		boolean comeca_if = false, termina_pr = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite qualquer palavra: ");
		palavra = input.next();

		// a) O número de caracteres da string.
		System.out.println("A palavra " + palavra + " possui " + palavra.length() + " caracteres");

		///////////////////////////////////////////////////////////////

		// b) A string com todas suas letras em maiússculo.
		System.out.println("A palavra " + palavra + " em maiúsculo: " + palavra.toUpperCase());

		//////////////////////////////////////////////////////////////////////////////

		// c) O número de vogais da string.
		char[] listaChar = palavra.toCharArray();

		for (int i = 0; i < listaChar.length; i++) {
			if (listaChar[i] == 'a' || listaChar[i] == 'e' || listaChar[i] == 'i' || listaChar[i] == 'o'
					|| listaChar[i] == 'u') {

				vogal += 1;

			}
		}

		System.out.println("A palavra " + palavra + " possuí " + vogal + " vogais");

		/////////////////////////////////////////////////////////////////////////

		// d) Se a string digitada começa com "IF" (ignorando maiuscula/minusculas).

		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(0) == 'i' || palavra.charAt(0) == 'I' || palavra.charAt(1) == 'f'
					|| palavra.charAt(1) == 'F')
				comeca_if = true;

		}

		if (comeca_if == true) {
			System.out.println("A palavra começa com as inicias if/IF.");
		} else {
			System.out.println("A palavra não começa com as inicias if/IF.");
		}

		//////////////////////////////////////////////////////////////////////////////
		int tam = palavra.length();

		// e) Se a string digitada termina com PR (ignorando maiusculas/minusculas)
		
			if (palavra.charAt(tam - 2) == 'p' || palavra.charAt(tam - 2) == 'P' || palavra.charAt(tam - 1) == 'r'
					|| palavra.charAt(tam - 1) == 'R')
				termina_pr = true;

		
		if (termina_pr == true) {
			System.out.println("A palavra termina com  pr/PR.");
		} else {
			System.out.println("A palavra não termina  pr/PR.");
		}

		// f) O numero de digitos (0 a 9) da string.

		/////////////////////////////////////////////////////////////////

		// g) Se a string é um palíndromo ou nao.

		/* palíndromo: diz-se de ou frase ou palavra que se pode ler, indiferentemente,
		da esquerda para a direita ou vice-versa
		*/
		String palindromo= "";
		for (int i = tam-1 ; i >= 0 ; i--) {
			palindromo+= palavra.charAt(i);
		}
		if(palindromo.equals(palavra) ) {
		System.out.println("A palavra é um palíndromo"+palindromo);

		}else {
			System.out.println("A palavra não é um palíndromo");
		}
		

	}

}