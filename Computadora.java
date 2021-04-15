
/**
 * Write a description of class Computadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computadora
{
 private String modelo;
 private String Procesador;
 private int Ram;
 private int Tamanio;//tamaño en GB
 private boolean TipoHDDoSDD;
 
 public Computadora(String M,String P,int R,int T,boolean THoS){
  this.modelo=M;
  this.Procesador=P;
  this.Ram=R;
  this.Tamanio=T;//tamaño en GB
  this.TipoHDDoSDD=THoS;     
 }
 
 public String getModelo(){
     return modelo;
 }
 public void setModelo(String Variable){
     this.modelo=Variable;
 }
 
  public String getProcesador(){
     return Procesador;
 }
 public void setProcesador(String Variable){
     this.Procesador=Variable;
 }
 
 public int getRam(){
     return Ram;
 }
 public void setRam(int Variable){
     this.Ram=Variable;
 }
  
 public int getTamanio(){
     return Tamanio;
 }
 public void setTamanio(int Variable){
     this.Tamanio=Variable;
 }
 
  public boolean getTipoHDDoSDD(){
     return TipoHDDoSDD;
 }
 public void setTipoHDDoSDD(boolean Variable){
     this.TipoHDDoSDD=Variable;
 }
 
 
}
