package eva1_17_areas;

public class EVA1_17_AREAS {

    public static void main(String[] args) {
        System.out.println("Area de circulo: "+ area(5));
        System.out.println("Area de triangulo: "+ area(5, 5));
        System.out.println("Area de circulo: "+ area(5, 5, 5));
    }
    
    public static double area(double radio){
        return Math.PI * (Math.pow(radio, 2));
    }
    public static double area(double base, double altura){
        return base * altura / 2;
    }
    public static double area(double altura, double baseMay, double baseMen){
        return altura * (baseMay + baseMen) / 2;
    }
}
