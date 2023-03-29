public class VetorDeReais {
   
    double[] vetor;

    public VetorDeReais(int tamanho) {
        this.vetor = new double[tamanho];
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

   
   
    public static void main(String[] args) {
        
        double[] c = new double[3];
        c[0] = 1.5;
        c[1] = 2.5;
        c[2] = 3.5;

        
    }
}
