package exercicio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ListaOrdenarNomes {
	public static void main(String[] args){
		
	// Para criar uma lista dinamica  ArrayList< Objeto > nomeDoArrayList = new ArrayList< Objeto >();
	 ArrayList <String> listaNomes = new ArrayList <String>();
			    
	int escolha, cont;
    String nome;
    
   
    
    
    
	do{
		System.out.println("1- Adcionar nome na lista.");
		System.out.println("2- Ver lista ordenada.");
		System.out.println("0 - Sair...");
		System.out.println("Digite sua escolha: ");
		Scanner entrada = new Scanner (System.in);
		escolha = entrada.nextInt();
		  		
		
		if(escolha == 1){
			System.out.println("Digite o nome: ");
			    			
			listaNomes.add(nome = entrada.nextLine());
			
		}else if(escolha == 2){
			Arrays.sort(listaNomes);
	        for(int i = 0; i < listaNomes.length(); i++)
	            System.out.println(listaNomes[i]);
			//System.out.println("Lista ordenada: "+listaNomes.sort());
			
		}else{
			System.out.println("Saindo...");
		}
		
	}while(cont != 0);
}


}
    

