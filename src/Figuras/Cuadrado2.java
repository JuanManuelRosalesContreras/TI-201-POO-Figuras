package Figuras;

public class Cuadrado2 extends Figuras{
    
    @Override
    public void imprimir(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                
                if(i == 0 || i == n-1){
                    System.out.print("*");
                } else {
                    if(j == 0 || j == n-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println("");
            
        }
    }
    
}
