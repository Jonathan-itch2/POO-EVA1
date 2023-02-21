package eva1_6_automovil;

public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Nissan", "Sentra", "7M0nGuz", 2018, "Diego Vazquez");
      
        auto1.imprimirDatos();
        
        System.out.println("");
        Automovil auto2 = new Automovil();
        
        auto2.imprimirDatos();
        
        System.out.println("");
        Automovil auto3 = new Automovil();
        
        auto3.setMarca("Toyota");
        auto3.setModelo("Tsuru");
        auto3.setPlacas("A65Tv7");
        auto3.setAno(1997);
        auto3.setPropietario("Angel Velazquez");
        auto3.imprimirDatos();
    }
}
