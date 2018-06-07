
import java.util.ArrayList;

public class Exemplo02 {

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jennifer");
        nomes.add("Eu aqui");
        
        int quantidadeDeItensNoArrayList = nomes.size();
        System.out.println(quantidadeDeItensNoArrayList);
        
        String maiorNome = "";
        if (nomes.get(0).length() > maiorNome.length()) {
            maiorNome = nomes.get(0);
        }
        
        if (nomes.get(1).length() > maiorNome.length()) {
            maiorNome = nomes.get(1);
        }
        
        String menorNome = "";
        for (int i = 65; i <= 100; i++) {
            for (int j = 65; j <= 90; j++) {
                menorNome += (char) i + "" + (char) j + "\n";
            }
        }
        if (nomes.get(0).length() < menorNome.length()) {
            menorNome = nomes.get(0);
        }
        
        if (nomes.get(1).length() < menorNome.length()) {
            menorNome = nomes.get(1);
        }
        
        System.out.println("Maior nome: " + maiorNome);
        System.out.println("Menor nome: " + menorNome);
    }
    
}
