<<<<<<< HEAD

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
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ExercicioArrayList04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
>>>>>>> 7d6f6098d4d54a7a01461d28f8b3b546575457bc
