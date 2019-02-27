package exercicio;

import java.util.Scanner;
import java.lang.reflect.Array;

public class ExerciciosJavaBasico {
	public static void main(String[] args) {
				
		/*
         * Escreva um método que receba por parâmetro um nome e retorne as
         * letras do nome que são vogais. Dica: utilize o método toCharArray()
         * da String .
         */
		
		int[] lista = new int[5];
		
		
		Scanner input = new Scanner(System.in);
        System.out.println("Insira 5 números inteiros no vetor: ");
        lista[0] = input.nextInt();
        lista[1] = input.nextInt();
        lista[2] = input.nextInt();
        lista[3] = input.nextInt();
        lista[4] = input.nextInt();
       
        PrimeiraPosicao.pegarposicao(lista);
        
        
       VerificaVogal confira = new VerificaVogal();
       
        
       // Scanner input = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        String result = confira.confereVogal(nome);
        //System.out.println(confira.listaVogal);
        System.out.println(result);
        
        
	}

}
