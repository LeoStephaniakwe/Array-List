
/**
 * @author Leonardo Moreira
 */
public class ExemploFor10 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            while (true) {
                if (i == 5) {
                    continue;
                }
                if (i == 8) {
                    break;
                }
            }
            System.out.println(i);
        }

    }

}
