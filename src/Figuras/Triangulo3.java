package Figuras;

public class Triangulo3 extends Figuras{
    @Override
    public void imprimir(){
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
                }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            
        }
        
        System.out.println("");
    }
}
