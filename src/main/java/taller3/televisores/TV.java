
package taller3.televisores;

public class TV {
    private Marca marca;
    int canal;
    private int precio;
    boolean estado;
    int volumen;
    Control control;
    public static int numTV=0;
     
    public TV (Marca marca, boolean estado){
        this.marca=marca;
        this.canal=1;
        this.precio=500;
        this.volumen=1;  
    }
    
    
    
    public Marca getMarca(){
        return marca;
    }
    
    public void setMarca(Marca newMarca){
        this.marca=newMarca;
        
    }
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int newPrecio){
        this.precio=newPrecio;
    }
    
    public Control getControl(){
        return control;
    }
    
    public void setControl(Control newControl){
        this.control=newControl;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setVolumen( int newVolumen){
        this.volumen=newVolumen;
    }
   
    public int getCanal(){
        return canal;
    }
    
    public void setCanal(int newCanal){
        this.canal=newCanal;
    }

    public TV(){
        ++numTV;
    }
    
    public boolean turnOn(){
        return true;
    }
    public boolean turnOff(){
        return false;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean newEstado){
        this.estado=newEstado;
      
    }
    
    
    public void canalUp(){
        if (estado==true){
            if (1<=canal && canal<120){
                ++canal;   
            } 
        }  
    }
    public void canalDown(){
        if (estado==false){
            if (1<canal && canal<=120){
                 --canal; 
            }
        }
    }
    
    public void volumenUp(){
        if (estado==true){
            if (1<=volumen && volumen<7){ 
                 ++volumen;
            }
        }   
    }    
    
    public void volumenDown(){
        if (estado==true){
            if (1<volumen && volumen<=7){ 
                --volumen;       
            }
        }
    }

}  

