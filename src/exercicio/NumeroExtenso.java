package exercicio;

public class NumeroExtenso {
	/*
	* Escreva um método que receba por parâmetro um valor inteiro e retorne uma
	* String contendo cada um dos seus dígitos por extenso. Exemplo: Entrada
	* (parâmetro) = 4571 Saída (retorno) = “quatro, cinco, sete, um”
	*/

	public int numero;

	public String  extenso() {
		//Conversão para string
		String num = this.numero+"";
		
		//Uma lista de strings que vai receber o resultado do metodo split que separa caracteres com base em um separador 
		String[] numeros = num.split("");
		
		//Declaração do resultado
		String result = "";
		
		// Um for que irá percorrer a lista
		for(int i=0; i < numeros.length; i++ ) {
			
		//Usa-se o switch para analisar multiplas comparações, separando por casos 
			//Utilização do switch para analisar as ocorrencias de caracteres especificos
			switch (numeros[i]) {
			case "1":
				result += "um";
				break;
			case "2":
				result += "dois";
				break;
			case "3":
				result += "três";
				break;
			case "4":
				result += "quatro";
				break;
			case "5":
				result += "cinco";
				break;
			case "6":
				result += "seis";
				break;
			case "7":
				result += "sete";
				break;
			case "8":
				result += "oito";
				break;
			case "9":
				result += "nove";
				break;
			case "0":
				result += "zero";
				break;

			default:
				break;
			}
			//Realizar operação ternaria para adcionar a "," caso não seja o último número e adcionar "" caso seja
			result+= (i!= (numeros.length - 1))? ", ":"";
		}
		
		
		return result;
	}
}