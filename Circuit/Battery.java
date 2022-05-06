package Circuit;

import javafx.scene.image.ImageView;


public class Battery {
    
    private double voltage;
    
    public Battery(){ 
    }
    
    public Battery(double voltage){
        this.voltage = voltage;
    }    
    
    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
   
}
