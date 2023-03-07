public class inteiroPositivo {
    int x;

    public void setValor(int valor) {
        if (valor >= 0) {
            this.x = valor;
        }
    }

    public int getValor(int valor) {
        return this.x;
    }

    public int multiplicar() {
        return this.x * inteiroPositivo.getValor();
    }




}
