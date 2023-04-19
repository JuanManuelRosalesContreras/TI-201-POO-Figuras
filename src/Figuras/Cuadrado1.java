package Figuras;

public class Cuadrado1 extends Figuras{
    
    @Override
    public void imprimir(){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
    }
    
}
