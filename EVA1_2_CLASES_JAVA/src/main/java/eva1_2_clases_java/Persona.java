package eva1_2_clases_java;

public class Persona {
    //atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private  boolean estadoCivil;
    //Metodos : comportamientos
    //Lectura y escritura de atributos 
    //Metodos get --> leer, metodos set --> escribir
    //Metodos:
    //Modificador valor de retorno nombre (argumentos) )(implementacion)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor ){
        nombre = valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivl(boolean valor){
        estadoCivil = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos almacenados: ");
                //concatenacion
                //+ suma (numeros) mas concatena <-- sobrecarga de operaciones
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        if(estadoCivil){
            System.out.println("Estado civil: casado");
        } else {
            System.out.println("Estado civil: soltero");
        }
    }
}
