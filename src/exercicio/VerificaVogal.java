package exercicio;

public class VerificaVogal {

	//Criação da variavel nome que vai ser usuda pra receber o nome do usuario
	public String nome;
	// Criação da variavel listaVogal que vai amarzenar as vogais 
	public String listaVogal = "";

	// Criando o metodo que vai ter retorno string 
	public String confereVogal(String nome) {
		char[] listaChar = nome.toCharArray();
		
		for (int i = 0; i < listaChar.length; i++) {
			if (listaChar[i] == 'a' || listaChar[i] == 'e' || listaChar[i] == 'i' || listaChar[i] == 'o'
					|| listaChar[i] == 'u') {
				
				listaVogal += listaChar[i];
			}

		}
		return listaVogal;
	}
}
