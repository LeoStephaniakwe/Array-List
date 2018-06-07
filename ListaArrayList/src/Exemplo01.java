
import java.util.ArrayList;

public class Exemplo01 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(23);
        numeros.add(25);
        numeros.add(23 + 1);
        numeros.add(21);
        
        int numeroPosicao0 = numeros.get(0);
        int numeroPosicao1 = numeros.get(1);
        int numeroPosicao2 = numeros.get(2);
        int numeroPosicao3 = numeros.get(3);
        int numeroPosicao4 = numeros.get(4);
        
        
        System.out.println("[0] => " + numeroPosicao0);
        System.out.println("[1] => " + numeroPosicao1);
        System.out.println("[2] => " + numeroPosicao2);
        System.out.println("[3] => " + numeroPosicao3);
        System.out.println("[4] => " + numeroPosicao4);
        
        int somaOutraForma = (numeros.get(0) + numeros.get(1) + numeros.get(2) + numeros.get(3) + numeros.get(4));
        int soma = (numeroPosicao0 + numeroPosicao1 + numeroPosicao2 + numeroPosicao3 + numeroPosicao4);
        
        System.out.println("Soma: " + soma);
        
        
    }
    
}
