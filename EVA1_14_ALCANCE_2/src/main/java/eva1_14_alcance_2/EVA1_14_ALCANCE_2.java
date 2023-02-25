package eva1_14_alcance_2;

public class EVA1_14_ALCANCE_2 {

    public static void main(String[] args) {
        int x = 100; //visible dentro de todo el bloque main
        for (int i = 0; i < 10; i++) {
            int x = 100; //la variable esta declarada en mai()
                         //es visible dentro del for
            int y = 100; // visible dentro del for
            if( i == 5){
                
            }
            
        }
        int y = 100; // aqui la variable del ciclo for no exixste  
                     //podemos declarar una variable del mismo nombre
    }
}
