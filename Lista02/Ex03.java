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
