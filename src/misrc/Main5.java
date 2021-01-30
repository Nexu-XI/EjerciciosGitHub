package misrc;


public class Main5 {
    
    public static void main(String[] args) {
        
        int[] num1 = {4,5,24,54,34,56};
        int[] num2 = new int[num1.length]; 
        
        System.arraycopy(num1, 0, num2, 0, num1.length);
        
        for(int i=0; i<num2.length; i++){
           System.out.println(num2[i]); 
        }
        
    } 
    
}
