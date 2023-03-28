public class Imposto {
    
    String nome;
    String cpf;
    String uf;
    int rendaAnual;


    public double aliquota() {

        double aliquota = 0;
        
        if ( this.rendaAnual >= 0 && this.rendaAnual <= 4000) {
            aliquota = 0;
        }

        if ( this.rendaAnual >= 4001 && this.rendaAnual <= 9000) {
            aliquota = 0.059;
        }

        if ( this.rendaAnual >= 9001 && this.rendaAnual <= 25000) {
            aliquota = 0.151;
        }

        if ( this.rendaAnual >= 25001 && this.rendaAnual <= 35000) {
            aliquota = 0.272;
        }

        if ( this.rendaAnual >= 35001 ) {
            aliquota = 0.31;
        }

        return aliquota;

    }

    public double aPagar() {
        return this.rendaAnual * this.aliquota();
    }

    public void setRendaAnual(int rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public void setNome(String nome) {
        this.nome = nome;   
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getRendaAnual() {
        return this.rendaAnual;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getUf() {
        return this.uf;
    }

    public static void main(String[] args) {
    
        Imposto pessoa = new Imposto();

        pessoa.setRendaAnual(40000);
        System.out.println(pessoa.aliquota());

    }
}
