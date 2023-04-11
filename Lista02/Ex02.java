public class Frase {
	
	private String frase;
	
	public Frase(String frase) {
		this.frase = frase;
	}

	
	public String[] getPalavras() {
		//lógica para separar strings
		String palavra = "";
		
		int qtd = 1;
		for (int i = 0; i < this.frase.length(); i++) {
			if (this.frase.charAt(i) == ' ') {
				qtd++;
			}
		}
		
		String[] palavras = new String[qtd];
		int qtdPalavras = 0;
		
		for (int i = 0; i < this.frase.length(); i++) {
			char letra = this.frase.charAt(i);
			
			if (letra == ' ') {
				if (!"".equals(palavra)) {
					palavras[qtdPalavras] = palavra;
					palavra = "";
					qtdPalavras++;
				}
			} else {
				palavra += letra;
			}
		}

		if (!"".equals(palavra)) {
			palavras[qtdPalavras] = palavra;
		}
		
		return palavras;
	}
	
	public String[] getPalavrasSimples() {
		return this.frase.split(" ");
	}
}
