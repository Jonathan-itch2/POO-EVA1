package eva1_3_constructores;


public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        
        cuenta1.setNomCliente("Cralos Slim");
        cuenta1.setSaldo(4000000);
        cuenta1.setNumeroCuenta("1");
        
        
        System.out.println("DATOS DEL CLIENTE: ");
        String nombre = cuenta1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumeroCuenta());
        System.out.println(cuenta1.getSaldo());
        
        //--------------------------------------------------
        System.out.println(" ");
        CuentaBancaria cuenta2 = new CuentaBancaria("4", 4444, "Khada Jhin");
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getNumeroCuenta());
        System.out.println(cuenta2.getSaldo());
        
        //--------------------------------------------------
        System.out.println("");
        CuentaBancaria cuenta3 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getNumeroCuenta());
        System.out.println(cuenta3.getSaldo());
    }
}
