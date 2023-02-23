package eva1_8_llamada_funcion;

public class EVA1_8_LLAMADA_FUNCION {

    public static void main(String[] args) {
        
    
        System.out.println("INICIA main()");
        A(); //LLAMADA A FUNCION
        System.out.println("TERMINA main()");
    }
    public static void A(){
        System.out.println("INICA A()");
        B(); //LLAMADA A FUNCION
        System.out.println("TERMINA A()");
    }
    public static void B(){
        System.out.println("INICA B()");
        System.out.println("TERMINA B()");
    }
}
