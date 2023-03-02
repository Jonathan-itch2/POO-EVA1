package eva1_19_static;

public class EVA1_19_STATIC {

    public static void main(String[] args) {
        
        System.out.println("Pi: " + Math.PI );
        System.out.println("Numero aleatorio: " + Math.random());
        utilerias utileria = new utilerias();
        
        utilerias.otroSalaudo();
        utileria.saludo();
        saludo2(); //SI NO EXISTE ESTATICO, Y SE HA CREADO UN OBJETO ,
                   //EL METODO NO EXISTE
    }
    public void saludo2(){
        System.out.println("HOLA!!");
    }
}

class utilerias{
    // ESTE METODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA 
    //CLASE, SOLO SE USA TARAVES DE UN OBJETO
    public void saludo(){
        System.out.println("HOLA!!");
    }
    
    //otroSaludo(): ESTE METODO SOLO EXISTE EN EL MOMENTO QUE EL PROGRAMA 
    //INICIA SU EJECUCION, NO EXISTE 
    public static void otroSalaudo(){
        System.out.println("Otro saludo (saludo)");
    }
}

class otraClase{
    
}
