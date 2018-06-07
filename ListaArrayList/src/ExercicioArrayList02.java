
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ExercicioArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Leonardo");
        nomes.add("Daniela");
        nomes.add("Jaqueline");
        nomes.add("Anna");
        nomes.add("Adriele");
        nomes.add("Jéssica");
        nomes.add("Tarina");
        nomes.add("Lauana");
        nomes.add("Helena");
        
        
        JOptionPane.showMessageDialog(null,
                 "1 => "+ nomes.get(0)
                + "\n2 => " + nomes.get(1)
                + "\n3 => " + nomes.get(2)
                + "\n4 => " + nomes.get(3)
                + "\n5 => " + nomes.get(4)
                + "\n6 => " + nomes.get(5)
                + "\n7 => " + nomes.get(6)
                + "\n8 => " + nomes.get(7)
                + "\n9 => " + nomes.get(8));
               
    }
    
}
