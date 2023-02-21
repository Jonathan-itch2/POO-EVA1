package eva1_6_automovil;

public class Automovil {
    private String marca;
    private String modelo;
    private String placas;
    private int ano;
    private String propietario;
    
    //constructor default
    public Automovil(){
        marca = "---";
        modelo = "---";
        placas = "---";
        ano = 0;
        propietario = "---";
    }
    
    //constructor con argumentos
    public Automovil(String marc, String mod, String plac, int a, String prop){
        marca = marc;
        modelo = mod; 
        placas = plac;
        ano = a;
        propietario = prop;
    }
    
    //metodos get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getPlacas(){
        return placas;
    }
    public int getAno(){
        return ano;
    }
    public String getPropietario(){
        return propietario;
    }
    
    //metodos set
    public void setMarca(String valor){
        marca = valor;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public void setPlacas(String valor){
        placas = valor;
    }
    public void setAno(int valor){
        ano = valor;
    }
    public void setPropietario(String valor){
        propietario = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placas: " + placas);
        System.out.println("Ano: " + ano);
        System.out.println("propietario: " + propietario);
        
        if(ano == 0){
            System.out.println("Adeudo: 0$");
        } else if( ano > 0 && ano <= 2000){
            System.out.println("Adeudo: 1500$");
        } else if( ano >= 2001 && ano <= 2005){
            System.out.println("Adeudo: 2000$");
        } else if( ano >= 2006 && ano <= 2010){
            System.out.println("Adeudo: 2500$");
        } else if( ano >= 2011 && ano <= 2015){
            System.out.println("Adeudo: 3000$");
        } else if( ano >= 2016 && ano <= 2023){
            System.out.println("Adeudo: 4000$");
        }
    }
}
