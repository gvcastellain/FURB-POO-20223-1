import java.util.Scanner;

public class Calculadora {

    float primeiro;
    float segundo;
    String resposta;

    public float soma(float primeiro, float segundo) {
        return this.primeiro + this.segundo;
    }

    public float subtrai(float primeiro, float segundo) {
        return this.primeiro - this.segundo;
    }

    public float multiplica(float primeiro, float segundo) {
        return this.primeiro * this.segundo;
    }

    public float divide(float primeiro, float segundo) {
        return this.primeiro / this.segundo;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Calculadora calcular = new Calculadora();
        
        calcular.primeiro = teclado.nextFloat();
        calcular.segundo = teclado.nextFloat();
        calcular.resposta = teclado.next();

    



        
        teclado.close();    
    }
}