public class Produto {

    String nome;
    String descrição;
    double precoUnitario;
    int desconto;



    public static void main(String[] args) {
        
    Produto produto1 = new Produto();

        produto1.nome = "Caderno";
        produto1.descrição = "Caderno em espiral tamanho médio";
        produto1.precoUnitario = 4.5;
        produto1.desconto = 15;

        System.out.println(produto1.nome);
        System.out.println(produto1.descrição);
        System.out.println(produto1.precoUnitario);
        System.out.println(produto1.desconto);
        

    Produto produto2 = new Produto();

        produto2.nome = "Caneta ESF";
        produto2.descrição = "Caneta esferográfica 5mm";
        produto2.precoUnitario = 1.2;
        produto2.desconto = 2;

        System.out.println(produto2.nome);
        System.out.println(produto2.descrição);
        System.out.println(produto2.precoUnitario);
        System.out.println(produto2.desconto);

    Produto produto3 = new Produto();

    produto3.nome = "Esquadro";
    produto3.descrição = "Esquadro de acrílico 20 cm";
    produto3.precoUnitario = 2.35;
    produto3.desconto = 10;

        System.out.println(produto3.nome);
        System.out.println(produto3.descrição);
        System.out.println(produto3.precoUnitario);
        System.out.println(produto3.desconto);
    }
}
