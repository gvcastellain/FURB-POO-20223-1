public class Palavra {
    
    String frase;

    public void frase (String texto) {
        this.setFrase(texto);
    }

    public String[] separar() {
        String retorno[];
        retorno = this.frase.split(" ");
        return retorno;
    }

  
    public String getFrase() {
        return this.frase;
    }
    
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
    public static void main(String[] args) {
     
        Palavra palavra = new Palavra();    

        palavra.setFrase("isso é um teste");
        System.out.println(palavra.separar());
    }
}
