import Figuras.Cuadrado1;
import Figuras.Triangulo1;
import Figuras.Triangulo2;

public class TestFiguras {
    public static void main(String []args){
        Cuadrado1 c1 = new Cuadrado1();
        Triangulo1 t1 = new Triangulo1();
        Triangulo2 t2 = new Triangulo2();
        
        c1.setN(4);
        c1.imprimir();
        
        t1.setN(4);
        t1.imprimir();
        
        t2.setN(4);
        t2.imprimir();        
    }
}
