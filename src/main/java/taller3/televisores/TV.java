
package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    Control control;
    private static int numTV;
     
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
    
    public void setMarca(Marca marca){
        this.marca=marca;
        
    }
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    
    public Control getControl(){
        return control;
    }
    
    public void setControl(Control control){
        this.control=control;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setVolumen( int volumen){
        this.volumen=volumen;
    }
   
    public int getCanal(){
        return canal;
    }
    
    public void setCanal(int canal) {
	if ((canal >= 1 && canal <= 120) && this.estado == true) {
		this.canal = canal;
	
	}
    }
    public static void setNumTv(int numTV){
	TV.numTV = numTV;
    }
	
    public static int getNumTV () {
	return numTV;
    }

    
    public void turnOn(){
        this.estado=true;
    }
    public void turnOff(){
        this.estado=false;
    }
    public boolean getEstado(){
        return estado;
    }

    public void canalUp () {
	if ((this.estado == true) && (this.canal < 120) ) {
		this.canal++;
	}
    }
	
    public void canalDown () {
	if ((this.estado == true) && (this.canal > 1) ) {
		this.canal--;
	}
    }
	
    public void volumenUp () {
	if ((this.estado == true) && (this.volumen < 7) ) {
		this.volumen++;
	}
    }
	
    public void volumenDown () {
	if ((this.estado == true) && (this.volumen > 1) ) {
		this.volumen--;
	}
    }
}  

