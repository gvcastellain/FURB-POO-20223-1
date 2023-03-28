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
