
package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    Control control;
    public static int numTV;
     
    public TV (Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
        this.canal=1;
        this.precio=500;
        this.volumen=1;  
        this.numTV++;
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
    
    public void setCanal(int canal) {
	if ((canal >= 1 && canal <= 120) && this.estado == true) {
		this.canal = canal;
	
	}
    }
    public static void setNumTV(int numTV) {
	TV.numTV = numTV;
    }
	
    public static int getNumTV () {
	return numTV;
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

