package exercicio;

import java.util.Scanner;

public class ManipulandoString {
	public static void main(String[] args) {
		/*
		 * Faça um programa que, a partir de uma string digitada pelo usuário,
		 * imprima: a) O número de caracteres da string. b) A string com todas
		 * suas letras em maiúsculo. c) O número de vogais da string. d) Se a
		 * string digitada começa com “IF” (ignorando maiúsculas/minúsculas). e)
		 * Se a string digitada termina com “PR” (ignorando
		 * maiúsculas/minúsculas). f) O número de dígitos (0 a 9) da string. g)
		 * Se a string é um palíndromo ou não.
		 */

		int vogal = 0;
		String palavra;
		

		Scanner input = new Scanner(System.in);
		System.out.println("Digite qualquer palavra: ");
		palavra = input.next();

		System.out.println("A palavra" + palavra + " possuí "
				+ palavra.length() + " caracteres");
		System.out.println("A palavra " + palavra + " em maiúsculo: "
				+ palavra.toUpperCase());

		char[] listaChar = palavra.toCharArray();
		System.out.println(palavra);
		for (int i = 0; i < listaChar.length; i++) {
			if (listaChar[i] == 'a' || listaChar[i] == 'e'
					|| listaChar[i] == 'i' || listaChar[i] == 'o'
					|| listaChar[i] == 'u') {

				vogal+=1;
			    
				System.out.println(listaChar[i]);
			}
		}
			System.out.println(listaChar);
			System.out.println("A palavra"+palavra+" possuí "+vogal+"vogais");

		}	
}

