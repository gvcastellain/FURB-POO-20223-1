public class VetorDeReais {
   
    private double[] vetor;

    public VetorDeReais(int tamanho) {
        this.vetor = new double[tamanho];
    }

    public int getTamanho() {
		return this.vetor.length;
	}

    public double getValor(int posicao) {
		return this.vetor[posicao];
	}

    public int pares() {

        int quantidade = 0;

        for (int i = 0; i < vetor.length; i++) {
           if ( (int) vetor[i] % 2 == 0) {
                    quantidade++;
           } 
        }

        return quantidade;
    }

    public double[] novo() {
        double[] vetorNovo = new double[this.vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] / vetor[i]; 
        }

        return vetor;
    }

    public void inverte() {
		double[] vetorInverso = new double[this.vetor.length];


        for (int i = 0; i < vetor.length; i++) {
            vetorInverso[vetor.length - i - 1] = this.vetor[i];
        }

        
        this.vetor = vetorInverso;
    }
   
   
    public static void main(String[] args) {
        
        VetorDeReais c = new VetorDeReais(3);
        c.vetor[0] = 1;
        c.vetor[1] = 2;
        c.vetor[2] = 4;

        c.inverte();
        
    }
}
