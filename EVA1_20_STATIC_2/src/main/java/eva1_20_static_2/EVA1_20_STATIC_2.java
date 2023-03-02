package eva1_20_static_2;

public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
        final int x;
        x = 100;
        x = 200;
        
        formulasGeometria formulas = new formulasGeometria();
        System.out.println("Pi: " + formulasGeometria.PI);
        System.out.println("Area triangulo: " + formulasGeometria.areaTriangulo(5, 5));
        System.out.println("Volumen esfera: " + formulasGeometria.volumenEsfera(10));
    }
    
}

class formulasGeometria{
    public static final double PI = 3.14159;
    
    public static double areaTriangulo(double base, double altura){
        return base * altura / 2;
    }
    public static double areaCirculo(double radio){
        return PI * (Math.pow(radio, 2));
    }
    public static double perimetroCirculo(double radio){
        return PI * (radio * 2);
    }
    public static double volumenEsfera(double radio){
        return (4/3) * PI * (Math.pow(radio, 3));
    }
}
