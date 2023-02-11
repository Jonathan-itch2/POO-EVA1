package eva1_3_constructores;

public class CuentaBancaria {
    
    //atributos de la clase deben de ser privados
    private String numeroCuenta;
    private double saldo;
    private String nomCliente;
    //constructores 
    //default y con argumentos
    public CuentaBancaria(){ //constructor default
        numeroCuenta = "-----";
        saldo = 0;
        nomCliente = "-----";  
    }    
    
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
        numeroCuenta = nCuenta;
        saldo = otroSaldo;
        nomCliente = nCliente;
    }
    
    //comportamientos
    //metodos get y set 
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNomCliente(){
        return nomCliente;
    }
    
    public void setNumeroCuenta(String valor){
        numeroCuenta = valor;
    }
    public void setSaldo(double valor){
        saldo = valor;
    }
    public void setNomCliente(String valor){
        nomCliente = valor;
    }
    
}
