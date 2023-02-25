package eva1_18_sobrecarga_rfc;
public class EVA1_18_SOBRECARGA_RFC {

    public static void main(String[] args) {
        System.out.println(generarRfc("JONATHAN", "SALAZAR", "VAZQUEZ", 2004, 03, 27));
        System.out.println(generarRfc("JONATHAN", "SALAZAR", 2004, 03, 27));
        System.out.println(generarRfc("JONATHAN", 2004, 03, 27));
    }
    public static String generarRfc(String nombre, String apPat, String apMat, int anio, int mes, int dia){
        String apP1 = apPat.charAt(0)+ "";
        String apP2 = apPat.charAt(1)+ "";
        String apM = apMat.charAt(0)+ "";
        String nom = nombre.charAt(0)+ "";
        String rfc = apP1 + apP2 + apM + nom + anio + mes + dia;
        return rfc;
    }
    
    //Sobrecargra para los casos:
    //Falte apellido materno --> sustituir por X
    //Falte ambos apellidos --> sustituir por XX
    public static String generarRfc(String nombre, String apPat, int anio, int mes, int dia){
        String apP1 = apPat.charAt(0)+ "";
        String apP2 = apPat.charAt(1)+ "";
        String nom = nombre.charAt(0)+ "";
        String rfc = apP1 + apP2 + "X" + nom + anio + mes + dia;
        return rfc;
    }
    
    public static String generarRfc(String nombre, int anio, int mes, int dia){
        String nom = nombre.charAt(0)+ "";
        String rfc = "XX" + nom + anio + mes + dia;
        return rfc;
    }
}
