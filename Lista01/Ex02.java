public class Produto {

    String nome;
    String descricao;
    double precoUnitario;
    int desconto;

    public void setNome(String nome) {
       this.nome = nome; 
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public int getDesconto() {
        return this.desconto;
    }

    

    public static void main(String[] args) {

    Produto produto1 = new Produto();

        produto1.setNome("Caderno");
        produto1.setDescricao("Caderno em espiral tamanho médio");
        produto1.setPrecoUnitario(4.5);
        produto1.setDesconto(15);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getPrecoUnitario());
        System.out.println(produto1.getDesconto());
        

    Produto produto2 = new Produto();

        produto2.setNome("Caneta ESF");
        produto2.setDescricao("Caneta esferográfica 5mm");
        produto2.setPrecoUnitario(1.2);
        produto2.setDesconto(2);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getPrecoUnitario());
        System.out.println(produto2.getDesconto());

    Produto produto3 = new Produto();

    produto3.setNome("Esquadro");
    produto3.setDescricao("Esquadro de acrílico 20 cm");
    produto3.setPrecoUnitario(2.35);
    produto3.setDesconto(10);

        System.out.println(produto3.getNome());
        System.out.println(produto3.getDescricao());
        System.out.println(produto3.getPrecoUnitario());
        System.out.println(produto3.getDesconto());
    }
}
