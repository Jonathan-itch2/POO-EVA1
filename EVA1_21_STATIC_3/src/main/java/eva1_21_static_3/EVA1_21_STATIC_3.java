
package eva1_21_static_3;

public class EVA1_21_STATIC_3 {

    public static void main(String[] args) {
        
        System.out.println(prueba.valor);
        prueba.valor ++;
        System.out.println(prueba.valor);
        System.out.println("AHORA CON OBJETOS");
        pruebaObjetos obj = new pruebaObjetos();
        System.out.println(obj.valor);
        obj.valor ++;
        System.out.println(obj.valor);
        pruebaObjetos obj2 = new pruebaObjetos();
        System.out.println(obj2.valor);
    }
}

class prueba{
    public static int valor = 100;
}

class pruebaObjetos{
    public int valor = 100;
}
