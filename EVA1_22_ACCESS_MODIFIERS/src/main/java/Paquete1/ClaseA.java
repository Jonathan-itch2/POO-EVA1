package Paquete1;

import Paquete2.ClaseE;

public class ClaseA{
    
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        ClaseB objB = new ClaseB();
        //objB.publicB; atributos visibles
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.publicC; atributos visibles
        //objC.defaultC
        
        ClaseD objD = new ClaseD();
        //objD.publicD; atributos visibles
        //objD.defaultD;
        
        
        //ClaseE esta en otro archivo y paquete
        //hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
        //objE.publicE solo se puede usar el atributo publico
        
        //claseF es default y es invisible
        //para las clases de este paquete1
        //ClaseF objF = new ClaseF();
    }
    
    
}
 class ClaseB{
    
    public int publicB;
    int defaultB;
    private int privateB;
    
}
