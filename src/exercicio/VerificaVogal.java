package exercicio;

public class VerificaVogal {

	// Criação da variavel nome que vai ser usuda pra receber o nome do usuario
	public String nome;
	// Criação da variavel listaVogal que vai amarzenar as vogais
	public static String listaVogal = "";

	// Criando o metodo que vai ter retorno string
	public static String confereVogal(String nome) {

		// Criando uma lista char para guardar cada caractere para verificação
		// com o metodo toCharArray()
		// o metodo toCharArray é responsavel tranformar em uma lista de char
		char[] listaChar = nome.toCharArray();

		// Esse for vai ser responsavel por verificar qual char é vogal
		for (int i = 0; i < listaChar.length; i++) {
			
			// if verificando a existencia das vogais
			if (listaChar[i] == 'a' || listaChar[i] == 'e'
					|| listaChar[i] == 'i' || listaChar[i] == 'o'
					|| listaChar[i] == 'u') {

				// A listaVogal vai armazenar as vogais que foram encontrados
				listaVogal += listaChar[i];
			}

		}
		// Retorna a listaVogal
		return listaVogal;
	}
}