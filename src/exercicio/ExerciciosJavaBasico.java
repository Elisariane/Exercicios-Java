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
        
        //////////////////////////////////////////////////////////
        
        /*
         * Escreva um método que receba por parâmetro um array de inteiros e
         * retorne todos os números pares armazenados no array.
         */
        
        MostrarVetor.todoVetor(lista);
        
        
        ////////////////////////////////////////////////////////
        
       VerificaVogal confira = new VerificaVogal();
       
        
       // Scanner input = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        String result = confira.confereVogal(nome);
        //System.out.println(confira.listaVogal);
        System.out.println(result);
        
        ///////////////////////////////////////////////////////////
        ArrayList <String> listaNomes = new ArraList <String>();
        
        int escolha;
        String nome;
        
        Scanner entrada = new Scanner (System.in);
    	do{
    		System.out.println("1- Adcionar nome na lista.");
    		System.out.println("2- Ver lista ordenada.");
    		System.out.println("0 - Sair...");
    		System.out.println("Digite sua escolha: ");
    		Scanner entrada = new Scanner (System.in);
    		escolha = entrada.nextInt();
    		  		
    		
    		if(escolha == 1){
    			System.out.println("Digite o nome: ");
    			    			
    			listaNome.add(nome = entrada.nextLine());
    		}
    		
    	}while();

    }
        
	}

}
