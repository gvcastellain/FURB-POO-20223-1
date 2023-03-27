package UNIDADE2;
public class Expressao {

    String exp;


    

    public int getPosicaoOperador() {
        int posicao = 0;

        for (int i = 0; i < exp.length(); i++) {
            if ( exp.charAt(i) == '+' || exp.charAt(i) == '-' ||
            exp.charAt(i) == '/' ||exp.charAt(i) == '*') {
                posicao = i + 1;
            }
        }
        return posicao;
    }


    public int getQtdeDivisores() {
        int cont = 0;
        for (int i = 0; i < exp.length(); i++) {
            if ( exp.charAt(i) == '/') {
                cont++;
            }
        }
        return cont;
    }


    
        
    public static void main(String[] args) {
        
        Expressao qqq = new Expressao();

        qqq.exp = "a-";
        System.out.println(qqq.getPosicaoOperador());
    }
}

package UNIDADE2;


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

package UNIDADE2;


public class Nome {


    String[] Entrada;

    
    public static String generateStarWarsName(String[] entrada) {

        String guarda[] = entrada[0].split(" ");
        String nome = guarda[guarda.length - 1].substring(0,3);
        nome += guarda[0].substring(0, 2 );
        nome += " ";
        nome += entrada[1].substring(0, 2);
        nome += entrada[2].substring(0, 3);


        return nome;

        }

    
 
    

    public static void main(String[] args) {
    
		String[] entrada = new String[3];

        entrada[0] = "gabriel vanzuita castellain";
        entrada[1] = "gomes";
        entrada[2] = "blumenau";

        System.out.println(generateStarWarsName(entrada));

    }
}

package UNIDADE2;

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
