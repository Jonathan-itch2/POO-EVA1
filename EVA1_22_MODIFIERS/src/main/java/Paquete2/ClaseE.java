package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicB; atributos visibles
        //objA.defaultB;
        
        //ClaseB es invisible por ser default
        //y esta en otro paquete
        //ClaseB objB = new ClaseB();
        
        ClaseC objC = new ClaseC();
        //objC.publicD; atributos visibles
        //objC.defaultD;
        
        
        //ClaseD esta en otro archivo y paquete
        //hay que agregar la clausula "import"
        //ClaseD objD = new ClaseD();
        
        ClaseF objF = new ClaseF();
        //objF.publicF; atributos visibles
        //objF.defaultF;
    }
}
class ClaseF {
    public int publicF;
    int defaultF;
    private int privateF;
}
