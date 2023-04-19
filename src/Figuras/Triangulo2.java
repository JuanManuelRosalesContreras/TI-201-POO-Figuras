package Figuras;

public class Triangulo2 extends Figuras{
    
    @Override
    public void imprimir(){
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                if(j < n -(i-1)){
                    System.out.print("");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }    
    
}
