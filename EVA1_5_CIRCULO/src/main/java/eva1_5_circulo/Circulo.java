package eva1_5_circulo;

public class Circulo {
    
    //inicializacion de atributos
    
    private double radio;
    private double perimetro;
    private double area;
    
    //constructor default con valores a 0
    public Circulo(){
        radio = 0;
        perimetro = 0;
        area = 0 ;
    }
    
    //constructor con argumentos
    public Circulo(double r){
        radio = r;
    }
    
    //set para dar valor a radio
    public void setRadio(double valor){
        radio = valor;
    }
    
    //get para mostrar el valor de perimetro
    public double getPerimetro(){
        return perimetro;
    }
    
    //get para mostrar el valor de area
    public double getArea(){
        return area;
    }
    
    //metodo que ejecutara los calculos para area y perimetro
    public void calcularPerimetroArea(){
        perimetro = (Math.PI)*(radio*2);
        area = (Math.PI)*(Math.pow(radio, 2));
    }
    
}
