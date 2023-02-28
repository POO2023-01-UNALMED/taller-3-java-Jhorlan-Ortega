
package taller3.televisores;

public class Control {
    TV tv; 
    public void enlazar(TV tv){
        this.tv=tv;
        tv.control=this;     
    }
    
    public void turnOff(){
        this.tv.turnOff();
        
        
    }
    public void turnOn(){
        this.tv.turnOn();
    }
    public void canalUp(){
        tv.setCanal(0);
    }
    public void canalDown(){
        tv.setCanal(0);
    }
    public void volumenUp(){
        tv.setVolumen(0);
    }
    public void volumenDown(){
        tv.setVolumen(0);
    }
    
    public void setCanal(int canal) {
	if ((canal>=1 && canal<=120) && this.tv.getEstado()==true){
	    this.tv.setCanal(canal);
	}
    }
	
    public void setTv(TV tv) {
	this.tv = tv;
    }
	
    public TV getTv () {
	return tv;
    }
    
    
    
    
}
