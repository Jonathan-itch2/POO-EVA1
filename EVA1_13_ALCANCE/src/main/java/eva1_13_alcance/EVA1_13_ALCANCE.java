package eva1_13_alcance;

public class EVA1_13_ALCANCE {

    public static void main(String[] args) {
        int x = 100; //visible para todo lo que esta dentro del main()
        for (int i = 0; i < 10; i++) {
            System.out.println("x = "+x);
            System.out.println("i = "+i);
            System.out.println("j = "+j); //variable no es visible 
                                          //no esta declarada antes la instruccion
            int j = 100; // apartir de aqui es visible
            System.out.println("j = "+j);
            {
                int z = 1000;
                System.out.println("z = "+z);
            }
            System.out.println("z = "+z); 
        } //termina el bloque for
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        
    }
    public static void algo(){
        System.out.println("x = "+x); // no es visible en algo()
    }
}
