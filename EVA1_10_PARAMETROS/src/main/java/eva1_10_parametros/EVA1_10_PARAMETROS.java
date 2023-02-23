package eva1_10_parametros;

public class EVA1_10_PARAMETROS {

    public static void main(String[] args) {
       nPrintln("Hola", 5); 
    }
    public static void nPrintln(String message, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
