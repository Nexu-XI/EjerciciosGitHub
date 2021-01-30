package misrc;


public class Main3 {

    public static void main(String[] args) {
        int[] num = {4,5,24,54,34,56};
            int menor = 99999;
            int mayor = 0;
            for(int i = 0; i<num.length; i++){
                if(menor>num[i])menor=num[i];
                if(mayor<num[i])mayor=num[i];
            }
            System.out.println("El mayor = " + mayor);
            System.out.println("El menor = " + menor);
    }   
}
