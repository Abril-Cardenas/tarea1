
/**
 * Write a description of class Computadora here.
 * 
 * @author (Gabriela Abril Cardenas Calizaya) 
 * @version (1.0)
 * Ing.informatica
 */
public class Compu
{
    boolean disco=true;
     Computadora computadora=new Computadora("","",16,1000,true);
     
    void disco(boolean d){
        disco=d;
    }
    
    String TipoHDDSDD(){
     String TDisco;
     computadora.setTipoHDDoSDD(disco);
     if(computadora.getTipoHDDoSDD()==true){
         TDisco="Disco Mecanico";
     }else{
         TDisco="Disco de Estado Solido";
     }
     return TDisco;
    }
    
     String DetalleComputadora(){
     Computadora PC = new Computadora("Lenovo","i5",16,2000,true);
     String Concatena;
     Concatena="Modelo: "+PC.getModelo()+" Procesador: "+PC.getProcesador()+" Tamaño del Disco: "+PC.getTamanio()+"GB";
     return Concatena;
    }
 
    public void verDatos(){
        String Ver1=TipoHDDSDD();
    }

}
