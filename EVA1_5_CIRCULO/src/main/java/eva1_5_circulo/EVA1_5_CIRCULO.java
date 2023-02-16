package eva1_5_circulo;


public class EVA1_5_CIRCULO {

    public static void main(String[] args) {
        
        
        Circulo circ1 = new Circulo(3); // le asigno un valor con el cosntructor con argumentos (valor 2)
        
        //circ1.setRadio(2); //valor ingresado por el metodo get
        
        circ1.calcularPerimetroArea(); 
        // de acuerdo al valor otorgado del radio, ejecutara los calculos para
        //encontrar el perimetro y el area del circulo
        
        System.out.println("El perimetro es: " + circ1.getPerimetro()); //llamada del get periemtro
        System.out.println("El area es: " + circ1.getArea()); //llamada del get area
    }
}
