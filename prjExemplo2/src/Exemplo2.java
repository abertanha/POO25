/**
 * @author Adriano Bertanha
 */
public class Exemplo2 {
    public static void main(String[] args) {
        int x;
        
        x = (int)(Math.random()*100);
        
        if(x<50){
            System.out.println("O valor " + x + " e menor que 50");
        }else{
            System.out.println("O valor " + x + " e maior ou igual a 50");
        }
    }
    
}