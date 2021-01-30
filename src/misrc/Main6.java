package misrc;

import java.util.Arrays;


public class Main6 {
 
    public static void main(String[] args) {
        
        String[] cadena1 = {"A","B","C","D","E"};
        String[] cadena2= {"1","2","3","4","5","6","7","8","9"};

        System.out.println("La cadena 1 antes del cambio: " +Arrays.toString(cadena1));
        System.out.println("La cadena 2 antes del cambio: " +Arrays.toString(cadena2));

        System.arraycopy(cadena1, 0, cadena2, 4, cadena1.length);

        System.out.println("La cadena 1 despues del cambio: " +Arrays.toString(cadena1));
        System.out.println("La cadena 2 despues del cambio: " +Arrays.toString(cadena2));
    } 
    
}
