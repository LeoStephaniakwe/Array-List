
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExercicioArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i <11; i++){
            numeros.add(i);
            JOptionPane.showMessageDialog(null, numeros.get(i));
            
        }
        
    }
    
}
