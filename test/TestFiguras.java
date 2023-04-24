import Figuras.Cuadrado1;
import Figuras.Triangulo1;
import Figuras.Triangulo2;
import Figuras.Cuadrado2;
import Figuras.Triangulo3;

public class TestFiguras {
    public static void main(String []args){
        Cuadrado1 c1 = new Cuadrado1();
        Triangulo1 t1 = new Triangulo1();
        Triangulo2 t2 = new Triangulo2();
        Cuadrado2 c2 = new Cuadrado2();
        Triangulo3 t3 = new Triangulo3();
        
        c1.setN(4);
        System.out.println("Cuadrado1-------------");
        c1.imprimir();
        
        t1.setN(4);
        System.out.println("Triangulo1-------------");
        t1.imprimir();
        
        c2.setN(4);
        System.out.println("Cuadrado2-------------");
        c2.imprimir();
        
        t2.setN(4);
        System.out.println("Triangulo2-------------");
        t2.imprimir();
        
        t3.setN(4);
        System.out.println("Triangulo3-------------");
        t3.imprimir();
    }
}
