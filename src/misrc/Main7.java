package misrc;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca el tamaño deseado del array");
        
        int size = scan.nextInt();
        
        int[] cadena = new int[size];
        
        for( int i=0; i<size; i++ ){
           
            cadena[i]=i;
           
        }
        System.out.println(Arrays.toString(cadena));
    }
}
