package eva1_2_clases_java;

public class EVA1_2_CLASES_JAVA {

    public static void main(String[] args) {
        //CLASE ES LA RECETA:
        //OBJETO ES EL PLATILLO
        //INSTANCIACION:
        //1. Declarar el identificador para el objeto
        //2. Asignar memoria con new 
        //Invocar su constructor 
        //Persona() --> constructor;
        //Constructor --> metodo
        
        Persona perso1 = new Persona();
        //System.out.println(perso1);
        //Esta seccion es por que iniciamos
        //atributos con modificador default
        /*
        perso1.nombre = "Ruben";
        perso1.apellido = "Hernandez";
        perso1.edad = 41;
        perso1.estadoCivil = true; //true = casado
        
        
        System.out.println(perso1.nombre);
        */
        perso1.setNombre("Ruben Alonzo"); 
        perso1.setApellido("Hernandez"); 
        perso1.setEdad(41);
        perso1.setEstadoCivl(true);
        
        /*
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadoCivil());
        */
        
        perso1.imprimirDatos();
        System.out.println(" ");
        
        //PERSONA 2
        Persona perso2 = new Persona();
        
        perso2.setNombre("Juan");
        perso2.setApellido("Vazquez");
        perso2.setEdad(50);
        perso2.setEstadoCivl(false);
        
        perso2.imprimirDatos();
    }
}
