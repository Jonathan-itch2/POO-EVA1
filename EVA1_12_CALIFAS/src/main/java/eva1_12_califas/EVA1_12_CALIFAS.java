package eva1_12_califas;

public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        String cali;
        cali = califas(85); // almacena resultado en mi variable
        System.out.println("Resultado: "+ cali); 
        System.out.println("Resultado: " + califas(75)); //Se llama al momento de imprimir (para no usar una variable)
        califas(100); // ingonra el resultado
    }

    public static String califas(int calif) {
        if (calif >= 91 && calif <= 100) {
            return "A";
        } else if (calif >= 81 && calif <= 90) {
            return "B";
        } else if (calif > 71 && calif <= 80) {
            return "C";
        } else {
            return "D";
        }
        /*String resultado;
        if (calif >= 91 && calif <= 100) {
            resultado = "A";
        } else if (calif >= 81 && calif <= 90) {
            resultado =  "B";
        } else if (calif > 71 && calif <= 80) {
            resultado = "C";
        } else {
            resultado = "D";
        }
        return resultado; */   
    }
}
