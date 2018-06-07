
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exemplo03 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
        }

        for (int i = 1; i < numeros.size(); i++) {
            System.out.println("[" + i + "] => "
                    + numeros.get(i));
        }

        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        double media = soma / numeros.size();

        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i);
            }
        }
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "A soma é: " + soma
                + "\nMédia: " + media
                + "\nMaior número: " + maiorNumero
                + "\nMenor número: " + menorNumero
        );
        
        

    }

}
