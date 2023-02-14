package eva1_4_tv;

public class Tv {
    private int volumen;
    private int canal;
    private boolean poder;
    
    //Metodos para operar la Tv (interfaz)
    public Tv(){
        volumen = 0;
        canal = 0;
        poder = false; //false = apagado

    }
    //metodos para operar la interfaz
    
    public void cambiarEstadoPoder(){
        if(poder == true){
            poder = false;
            System.out.println("Apagando pantalla");
        } else {
            poder = true;
            System.out.println("Encendiendo pantalla");
        }
    }
    //volumen
    public void subirVolumen(){
        if(poder == true){  //if (poder) la tv esta prendida
            if(volumen < 100){
                volumen ++; // acomulador
                System.out.println("Volumen: " + volumen);
            }
        } else {
            System.out.println("La pantalla esta apagada, no se ejecutara el volumen");
        } 
    }
    
     public void bajarVolumen(){
        if(poder == true){ //if (poder) la tv esta prendida
            if(volumen > 0){
                volumen --; //acomulador
                System.out.println("Volumen: " + volumen);
            }
        } else {
            System.out.println("La pantalla esta apagada, no se ejecutara el volumen");
        } 
    }
     
     //canal
     public void subirCanal(){
        if(poder == true){  //if (poder) la tv esta prendida
            //si pasa de 100, esta pasara a 0
            canal++; //acomulador
            if(canal > 100){
                canal = 0;
            }
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("La pantalla esta apagada, no se ejecutara el canal");
        } 
    }
    
     public void bajarCanal(){
        if(poder == true){  //if (poder) la tv esta prendida
            //si pasa de 0, esta empezara en 100
            canal--; //acomulador
            if(canal < 0){
                canal = 100;
            } 
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("La pantalla esta apagada, no se ejecutara el canal");
        } 
    }
}


