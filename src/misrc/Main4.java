package misrc;

public class Main4 {

    public static void main(String[] args) {
        int resultado=0;
        int resultado2=0;
        int[] numero = {4,5,24,54,34,56};
        for(int i=0; i<numero.length; i++){
            resultado = (resultado + numero[i]);
        }
        resultado2 = resultado/numero.length;
        System.out.println("El resultado es " + resultado2);
    }   
    
}
