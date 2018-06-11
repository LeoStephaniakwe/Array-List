
import java.util.ArrayList;
public class ExercicioArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
            System.out.println(numeros.get(i));
        }
        System.out.println("\n\n");
        numeros.remove(3);
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("\n\n");
        numeros.remove(4);
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
            
        }
        
        
    }
}
