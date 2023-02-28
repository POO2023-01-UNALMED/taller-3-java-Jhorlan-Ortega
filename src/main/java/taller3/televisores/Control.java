
package taller3.televisores;

public class Control {
    TV tv; 
    public void enlazar(TV televisor){
        tv=televisor;
        tv.SetControl(this);
       
    
         
    }
    
    public void turnOff(){
        tv.setEstado(false);
        
    }
    public void turnOn(){
        tv.setEstado(true);
        
    }
    
}
