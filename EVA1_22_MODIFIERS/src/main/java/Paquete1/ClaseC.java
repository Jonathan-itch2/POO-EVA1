package Paquete1;

import Paquete2.ClaseE;

public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA; atributos visibles
        //objB.defaultB;
        
        ClaseB objB = new ClaseB();
        //objC.publicB; atributos visibles
        //objC.defaultB
        
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

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
