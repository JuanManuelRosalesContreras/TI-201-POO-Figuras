package Figuras;

public class Triangulo2 extends Figuras{
    
    @Override
    public void imprimir(){
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= (n - i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }    
    
}
