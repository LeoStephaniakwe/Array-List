
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExercicioArrayList01 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);


        JOptionPane.showMessageDialog(null, 
                "[0] => "+ numeros.get(0)
                + "\n[1] => " + numeros.get(1)
                + "\n[2] => " + numeros.get(2)
                + "\n[3] => " + numeros.get(3)
                + "\n[4] => " + numeros.get(4)
                + "\n[5] => " + numeros.get(5)
                + "\n[6] => " + numeros.get(6)
                + "\n[7] => " + numeros.get(7)
                + "\n[8] => " + numeros.get(8)
                + "\n[9] => " + numeros.get(9)
                + "\n[10] => " + numeros.get(10)
                + "\n[11] => " + numeros.get(11)
                + "\n[12] => " + numeros.get(12)
                + "\n[13] => " + numeros.get(13)
                + "\n[14] => " + numeros.get(14));

    }

}
