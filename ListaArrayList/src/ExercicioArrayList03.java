
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExercicioArrayList03 {

    public static void main(String[] args) {
        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('L');
        caracteres.add('E');
        caracteres.add('O');
        caracteres.add('N');
        caracteres.add('A');
        caracteres.add('R');
        caracteres.add('D');
        caracteres.add('O');
        caracteres.add('S');
        caracteres.add('T');
        caracteres.add('K');

        JOptionPane.showMessageDialog(null,caracteres.get(0) + "" 
                + caracteres.get(1) + "" 
                + caracteres.get(2) + "" 
                + caracteres.get(3) + ""
                + caracteres.get(4) + ""
                +caracteres.get(5)  + ""
                + caracteres.get(6) + ""  
                + caracteres.get(7) + "" + " "
                +caracteres.get(8)  + "" 
                + caracteres.get(9)+ "" 
                +caracteres.get(10));
    }
}

