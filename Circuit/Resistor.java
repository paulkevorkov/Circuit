/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circuit;

import javafx.scene.image.ImageView;

/**
 *
 * @author paulk
 */
public class Resistor {
    
    private double resistance;
    private double current;
    private double voltage;
    
    public Resistor(){
    }
    
    public Resistor(double res, double current, double volt){
        this.resistance = res;
        this.current = current;
        this.voltage = volt;
    }
    
    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }   
    
}
