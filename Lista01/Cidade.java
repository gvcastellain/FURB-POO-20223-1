public class Cidade {

    String nome;
    int PopulacaoMasculina;
    int PopulacaoFeminina;
    String Uf;
    boolean calculado;
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public void setPopulacaoFeminina(int populacaoFeminina) {
        this.PopulacaoFeminina = populacaoFeminina;
    }

    public void setPopulacaoMasculina(int populacaoMasculina) {
        this.PopulacaoMasculina = populacaoMasculina;
    }

    public void setCalculado(boolean calculado) {
        this.calculado = calculado;
    }
   

    public static void main(String[] args) {
        Cidade gaspar = new Cidade();
        
            gaspar.setNome( "Gaspar" );
            gaspar.setUf( "SC" );
            gaspar.setPopulacaoMasculina( 28141 );
            Cidade indaial = new Cidade();
            indaial.setNome( "Indaial" );
            indaial.setPopulacaoFeminina( 25844 );
            indaial.setCalculado(true);

        Cidade blumenau = new Cidade();
            
            blumenau.setNome("Blumenau");
            blumenau.setPopulacaoMasculina(154580);
            blumenau.setPopulacaoFeminina(165420);
    
    }   
}

