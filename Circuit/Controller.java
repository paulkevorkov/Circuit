
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InteractiveCircuitBuilder.main;


import InteractiveCircuitBuilder.Classes.Battery;
import InteractiveCircuitBuilder.Classes.Resistor;
import java.io.IOException;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Controller implements Initializable {

@FXML Button GoMenu, GoSeries1, GoSeries2,GoSeries3, GoParallel1,GoParallel2 ,SetBatSit1Series, SetResSit1Series, SetCurrentSit1Series1,
        SetRes1Sit2Series, SetRes2Sit2Series, SetCur1Sit2Series, SetCur2Sit2Series, SetBatSit3Series,
        SetRes1Sit3Series, SetRes2Sit3Series, SetRes3Sit3Series, SetCur1Sit3Series, SetCur2Sit3Series,
        SetCur3Sit3Series, SetBatSit1Parallel, SetRes1Sit1Parallel, SetRes2Sit1Parallel, SetCur1Sit1Parallel,
        SetCur2Sit1Parallel, SetBatSit2Parallel, SetRes1Sit2Parallel, SetRes2Sit2Parallel, SetRes3Sit2Parallel,
        SetCur1Sit2Parallel, SetCur2Sit2Parallel, SetCur3Sit2Parallel;
@FXML TextField batValueSit1Series, resistanceSit1Series, currentSit1Series1, batValueSit2Series,
        resistanceSit2Series, resistance2Sit2Series1, current1Sit2Series, current2Sit2Series, 
        batValueSit3Series, resistance1Sit3Series, resistance2Sit3Series, resistance3Sit3Series,
        current1Sit3Series, current2Sit3Series, current3Sit3Series, batValueSit1Parallel, resistance1Sit1Parallel,
        resistance2Sit1Parallel, current1Sit1Parallel, current2Sit1Parallel, batValueSit2Parallel, resistance1Sit2Parallel,
        resistance2Sit2Parallel,resistance3Sit2Parallel, current1Sit2Parallel, current2Sit2Parallel, current3Sit2Parallel;
@FXML Label labelBatSit1Series, labelResSit1Series, labelCurSit1Series;
@FXML Label labelBatSit2Series, labelRes1Sit2Series, labelRes2Sit2Series, labelCur1Sit2Series, labelCur2Sit2Series;
@FXML Label labelBatSit3Series, labelRes1Sit3Series, labelRes2Sit3Series, labelRes3Sit3Series, labelCur1Sit3Series, labelCur2Sit3Series, labelCur3Sit3Series;
@FXML Label labelBatSit1Parallel, labelRes1Sit1Parallel, labelRes2Sit1Parallel, labelCur1Sit1Parallel, labelCur2Sit1Parallel;
@FXML Label labelBatSit2Parallel, labelRes1Sit2Parallel, labelRes2Sit2Parallel, labelRes3Sit2Parallel, labelCur1Sit2Parallel, labelCur2Sit2Parallel, labelCur3Sit2Parallel;
//CHANGE SCENES
    
public void switchToSeries1() throws IOException {
    URL url = new URL("file:///C:/Users/User/Downloads/project/InteractiveCircuitBuilder-main/Resources/CircuitBuilder/Series_Situation_1.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries1.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToSeries2() throws IOException {
    URL url = new URL("file:///C:/Users/User/Downloads/project/InteractiveCircuitBuilder-main/Resources/CircuitBuilder/Series_Situation_2.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries2.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToSeries3() throws IOException {
    URL url = new URL("file:///C:/Users/User/Downloads/project/InteractiveCircuitBuilder-main/Resources/CircuitBuilder/Series_Situation_3.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries3.getScene().getWindow();
    window.setScene(new Scene(root));
}
public void switchToParallel1() throws IOException {
    URL url = new URL("file:///C:/Users/User/Downloads/project/InteractiveCircuitBuilder-main/Resources/CircuitBuilder/Parallel_Situation_1.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoParallel1.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToParallel2() throws IOException {
    URL url = new URL("file:///C:/Users/User/Downloads/project/InteractiveCircuitBuilder-main/Resources/CircuitBuilder/Parallel_Situation_2.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoParallel2.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToMenu() throws IOException {
    URL url = new URL("file:///C:/Users/User/Downloads/project/InteractiveCircuitBuilder-main/Resources/CircuitBuilder/Circuit_Builder_Menu.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoMenu.getScene().getWindow();
    window.setScene(new Scene(root));
}


        
        
    Alert alert = new Alert(Alert.AlertType.NONE);
    
    
    
    
    
//HANDLE OUTPUTS
    
    //SITUATION 1 SERIES INPUTS
    Battery batSeries1 = new Battery();
    Resistor resSeries1 = new Resistor();
    
    public void setBatValueSit1Series() {
        try{
            double voltage = Double.parseDouble(batValueSit1Series.getText());
            batSeries1.setVoltage(voltage);
            labelBatSit1Series.setText(batSeries1.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as voltage value !");
            alert.showAndWait();
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number higher than 0 as voltage value !");
            alert.showAndWait();
        }
    }

    public void setRes1ValueSit1Series() {
        try{
            double resist1 = Double.parseDouble(resistanceSit1Series.getText());
            resSeries1.setResistance(resist1);
            labelResSit1Series.setText(resSeries1.getResistance() + "Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }

    public void setCur1ValueSit1Series() {
        try{
            double current1 = Double.parseDouble(currentSit1Series1.getText());
            resSeries1.setCurrent(current1);
            labelCurSit1Series.setText(resSeries1.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }


    //SITUATION 2 SERIES INPUTS
    Battery batSeries2 = new Battery();
    Resistor res1Series2 = new Resistor();
    Resistor res2Series2 = new Resistor();

    public void setBatValueSit2Series() {
        try{
            double voltage = Double.parseDouble(batValueSit2Series.getText());
            batSeries2.setVoltage(voltage);
            labelBatSit2Series.setText(batSeries2.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as voltage value !");
            alert.showAndWait();
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number higher than 0 as voltage value !");
            alert.showAndWait();
        }
    }

    public void setRes1ValueSit2Series() {
        try{
            double resist1 = Double.parseDouble(resistanceSit2Series.getText());
            res1Series2.setResistance(resist1);
            labelRes1Sit2Series.setText(res1Series2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }

    public void setRes2ValueSit2Series() {
        try{
            double resist1 = Double.parseDouble(resistance2Sit2Series1.getText());
            res2Series2.setResistance(resist1);
            labelRes2Sit2Series.setText(res2Series2.getResistance()+"Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setCur1ValueSit2Series() {
        try{
            double current1 = Double.parseDouble(current1Sit2Series.getText());
            res1Series2.setCurrent(current1);
            labelCur1Sit2Series.setText(res1Series2.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    public void setCur2ValueSit2Series() {
        try{
            double current1 = Double.parseDouble(current2Sit2Series.getText());
            res2Series2.setCurrent(current1);
            labelCur2Sit2Series.setText(res2Series2.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }

    
    //SITUATION 3 SERIES INPUTS
    Battery batSeries3 = new Battery();
    Resistor res1Series3 = new Resistor();
    Resistor res2Series3 = new Resistor();
    Resistor res3Series3 = new Resistor();


    public void setBatValueSit3Series() {
        try{
            double voltage = Double.parseDouble(batValueSit3Series.getText());
            batSeries3.setVoltage(voltage);
            labelBatSit3Series.setText(batSeries3.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as voltage value !");
            alert.showAndWait();
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number higher than 0 as voltage value !");
            alert.showAndWait();
        }
    }

    public void setRes1ValueSit3Series() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit3Series.getText());
            res1Series3.setResistance(resist1);
            labelRes1Sit3Series.setText(res1Series3.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
}   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }

    public void setRes2ValueSit3Series() {
        try{
            double resist1 = Double.parseDouble(resistance2Sit3Series.getText());
            res2Series3.setResistance(resist1);
            labelRes2Sit3Series.setText(res2Series3.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    
    public void setRes3ValueSit3Series() {
        try{
            double resist1 = Double.parseDouble(resistance3Sit3Series.getText());
            res3Series3.setResistance(resist1);
            labelRes3Sit3Series.setText(res3Series3.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setCur1ValueSit3Series() {
        try{
            double current1 = Double.parseDouble(current1Sit3Series.getText());
            res1Series3.setCurrent(current1);
            labelCur1Sit3Series.setText(res1Series3.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    
    public void setCur2ValueSit3Series() {
        try{
            double current1 = Double.parseDouble(current2Sit3Series.getText());
            res2Series3.setCurrent(current1);
            labelCur2Sit3Series.setText(res2Series3.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    
    public void setCur3ValueSit3Series() {
        try{
            double current1 = Double.parseDouble(current3Sit3Series.getText());
            res3Series3.setCurrent(current1);
            labelCur3Sit3Series.setText(res3Series3.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }

    

    //SITUATION 1 PARALLEL INPUTS

    Battery batParallel1 = new Battery();
    Resistor res1Parallel1 = new Resistor();
    Resistor res2Parallel1 = new Resistor();
    
    

    public void setBatValueSit1Parallel() {
        try{
            double voltage = Double.parseDouble(batValueSit1Parallel.getText());
            batParallel1.setVoltage(voltage);
            labelBatSit1Parallel.setText(batParallel1.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as voltage value !");
            alert.showAndWait();
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number higher than 0 as voltage value !");
            alert.showAndWait();
        }
    }

    public void setRes1ValueSit1Parallel() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit1Parallel.getText());
            res1Parallel1.setResistance(resist1);
            labelRes1Sit1Parallel.setText(res1Parallel1.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }

    public void setRes2ValueSit1Parallel() {
        try{
            double resist1 = Double.parseDouble(resistance2Sit1Parallel.getText());
            res2Parallel1.setResistance(resist1);
            labelRes2Sit1Parallel.setText(res2Parallel1.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setCur1ValueSit1Parallel() {
        try{
            double current1 = Double.parseDouble(current1Sit1Parallel.getText());
            res1Parallel1.setCurrent(current1);
            labelCur1Sit1Parallel.setText(res1Parallel1.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    public void setCur2ValueSit1Parallel() {
        try{
            double current1 = Double.parseDouble(current2Sit1Parallel.getText());
            res2Parallel1.setCurrent(current1);
            labelCur2Sit1Parallel.setText(res2Parallel1.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }

    //HANDLE CALCULATE PARALLEL 1
    
    public void handleCalculateSit1Parallel(){
        
       //if no input
       if (batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty()
               && resistance2Sit1Parallel.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter inputs for 2 categories (battery voltage, resitances or currents)");
            alert.showAndWait();
       }
       //if 4 empty sauf 2 resistance et 2 currents
       
       else if ((batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty())||
               (batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()) || 
               (batValueSit1Parallel.getText().isEmpty()&& resistance1Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()&& current1Sit1Parallel.getText().isEmpty()) ||
               (batValueSit1Parallel.getText().isEmpty()&& resistance1Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()&&current2Sit1Parallel.getText().isEmpty())){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter inputs for 2 categories (battery voltage, resitances or currents)");
            alert.showAndWait();
  
       }
       
       //if 3 empty
       else if ((batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()) ||
               (batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty()) ||
               (batValueSit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()) ||
               (batValueSit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty()) ||
               (current1Sit1Parallel.getText().isEmpty()&& resistance1Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()) ||
               (current2Sit1Parallel.getText().isEmpty()&& resistance1Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()) ||
               (current1Sit1Parallel.getText().isEmpty()&& current2Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()) ||
               (current2Sit1Parallel.getText().isEmpty()&& current1Sit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty())){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Please enter inputs for 2 categories (battery voltage, resitances or currents)");
                    alert.showAndWait();
       }
       //if 2 empty
       else if ((batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty())||
               (batValueSit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty()) ||
               (batValueSit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty()) ||
               (batValueSit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()) ||
               (current1Sit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty()) ||
               (resistance1Sit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty()) ||
               (current1Sit1Parallel.getText().isEmpty()&& resistance2Sit1Parallel.getText().isEmpty()) ||
               (current2Sit1Parallel.getText().isEmpty()&& resistance2Sit1Parallel.getText().isEmpty()))
               {
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Please enter inputs for 2 categories (battery voltage, resitances or currents)");
                    alert.showAndWait();
       }
       
       //if battery and current missing
       else if (batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Battery Voltage or Currents for Resistors 1 and 2");
            alert.showAndWait();
       }
       
       
       //if battery and resistors missing
       else if (batValueSit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty()
               && resistance2Sit1Parallel.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Battery Voltage or Resistances 1 and 2");
            alert.showAndWait();
           
       }
       //if current and resistors missing
       
       else if (resistance1Sit1Parallel.getText().isEmpty()&& resistance2Sit1Parallel.getText().isEmpty()&& current2Sit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty()){           
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Currents for Resistors 1 and 2 or Resistances 1 and 2");
            alert.showAndWait();
       
    }
       
       //RESULT IF HAVE VOLTAGE AND CURRENT
       else if ((current1Sit1Parallel.getText().isEmpty()==false)&& (current2Sit1Parallel.getText().isEmpty()==false) && (batValueSit1Parallel.getText().isEmpty()==false)){
           double resistance1 = (batParallel1.getVoltage() / res1Parallel1.getCurrent());
           double resistance2 = (batParallel1.getVoltage() / res2Parallel1.getCurrent());
           
           labelRes1Sit1Parallel.setText(resistance1+" Ohm");
           labelRes2Sit1Parallel.setText(resistance2+" Ohm");
       }
       
       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false) && (batValueSit1Parallel.getText().isEmpty()==false)){
           double current1 = (batParallel1.getVoltage() / res1Parallel1.getResistance());
           double current2 = (batParallel1.getVoltage() / res2Parallel1.getResistance());
           
           labelCur1Sit1Parallel.setText(current1+" A");
           labelCur2Sit1Parallel.setText(current2+" A");
       }
       
       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit1Parallel.getText().isEmpty()==false)&& (current2Sit1Parallel.getText().isEmpty()==false) && (resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false)){
           double voltage1 = (res1Parallel1.getResistance() * res1Parallel1.getCurrent());
           double voltage2 = (res2Parallel1.getResistance() * res2Parallel1.getCurrent());
           
           double voltageTotal = voltage1 + voltage2;
           labelBatSit1Parallel.setText(voltageTotal+" V");
       }
    }
    
    public void handleStepsSit1Parallel(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label steps = new Label();
        steps.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(steps, 0, 0);
        
    //RESULT IF HAVE VOLTAGE AND CURRENT
           if ((current1Sit1Parallel.getText().isEmpty()==false)&& (current2Sit1Parallel.getText().isEmpty()==false) && (batValueSit1Parallel.getText().isEmpty()==false)){
               steps.setText(" In order to find the resistance of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " V = "+batParallel1.getVoltage()+" V\n"
                       + " I1 = "+res1Parallel1.getCurrent()+" A\n"
                       + " I2 = "+res2Parallel1.getCurrent()+" A\n\n"
                       + " R1 = V/I1 = "+(batParallel1.getVoltage() / res1Parallel1.getCurrent())+" Ohm\n"
                       + " R2 = V/I2 = "+(batParallel1.getVoltage() / res2Parallel1.getCurrent())+" Ohm\n");     
       }
       
       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false) && (batValueSit1Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the current of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " V = "+batParallel1.getVoltage()+" V\n"
                       + " R1 = "+res1Parallel1.getResistance()+" Ohm\n"
                       + " R2 = "+res2Parallel1.getResistance()+" Ohm\n\n"
                       + " I1 = V/R1 = "+(batParallel1.getVoltage() / res1Parallel1.getResistance())+" A\n"
                       + " I2 = V/R2 = "+(batParallel1.getVoltage() / res2Parallel1.getResistance())+" A\n");
           
       }
       
       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit1Parallel.getText().isEmpty()==false)&& (current2Sit1Parallel.getText().isEmpty()==false) && (resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the voltage,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " I1 = "+res1Parallel1.getCurrent()+" A\n"
                       + " I2 = "+res2Parallel1.getCurrent()+" A\n"
                       + " R1 = "+res1Parallel1.getResistance()+" Ohm\n"
                       + " R2 = "+res2Parallel1.getResistance()+" Ohm\n\n"
                       + " V1 = I1*R1 = "+(res1Parallel1.getResistance() * res1Parallel1.getCurrent())+" V\n"
                       + " V2 = I2*R2 = "+(res2Parallel1.getResistance() * res2Parallel1.getCurrent())+" V\n"
                       + " V = V1+V2 = "+((res1Parallel1.getResistance() * res1Parallel1.getCurrent())+(res2Parallel1.getResistance() * res2Parallel1.getCurrent()))+" V\n");
           

       }
        Scene scene = new Scene(layout, 520, 400);  
        stage.setTitle("Steps");
        stage.setScene(scene);
        stage.show();
        
    }
    
    
    
    //SITUATION 2 PARALLEL INPUTS
    Battery batParallel2 = new Battery();
    Resistor res1Parallel2 = new Resistor();
    Resistor res2Parallel2 = new Resistor();
    Resistor res3Parallel2 = new Resistor();

    public void setBatValueSit2Parallel() {
        try{
            double voltage = Double.parseDouble(batValueSit2Parallel.getText());
            batParallel2.setVoltage(voltage);
            labelBatSit2Parallel.setText(batParallel2.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as voltage value !");
            alert.showAndWait();
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number higher than 0 as voltage value !");
            alert.showAndWait();
        }
    }

    public void setRes1ValueSit2Parallel() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit2Parallel.getText());
            res1Parallel2.setResistance(resist1);
            labelRes1Sit2Parallel.setText(res1Parallel2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }

    public void setRes2ValueSit2Parallel() {
        try{
            double resist1 = Double.parseDouble(resistance2Sit2Parallel.getText());
            res2Parallel2.setResistance(resist1);
            labelRes2Sit2Parallel.setText(res2Parallel2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setRes3ValueSit2Parallel() {
        try{
            double resist1 = Double.parseDouble(resistance3Sit2Parallel.getText());
            res3Parallel2.setResistance(resist1);
            labelRes3Sit2Parallel.setText(res3Parallel2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setCur1ValueSit2Parallel() {
        try{
            double current1 = Double.parseDouble(current1Sit2Parallel.getText());
            res1Parallel2.setCurrent(current1);
            labelCur1Sit2Parallel.setText(res1Parallel2.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    public void setCur2ValueSit2Parallel() {
        try{
            double current1 = Double.parseDouble(current2Sit2Parallel.getText());
            res2Parallel2.setCurrent(current1);
            labelCur2Sit2Parallel.setText(res2Parallel2.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    public void setCur3ValueSit2Parallel() {
        try{
            double current1 = Double.parseDouble(current3Sit2Parallel.getText());
            res3Parallel2.setCurrent(current1);
            labelCur3Sit2Parallel.setText(res3Parallel2.getCurrent()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as current value !");
            alert.showAndWait();

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
        
//HANDLE CALCULATE PARALLEL 2
    
    public void handleCalculateSit2Parallel(){
       
       //if 2 empty
        if ((batValueSit2Parallel.getText().isEmpty() && current2Sit2Parallel.getText().isEmpty())||
               (batValueSit2Parallel.getText().isEmpty() && current1Sit2Parallel.getText().isEmpty()) ||
               (batValueSit2Parallel.getText().isEmpty() && current3Sit2Parallel.getText().isEmpty()) ||
               (batValueSit2Parallel.getText().isEmpty() && resistance1Sit2Parallel.getText().isEmpty()) ||
               (batValueSit2Parallel.getText().isEmpty() && resistance2Sit2Parallel.getText().isEmpty()) ||
               (batValueSit2Parallel.getText().isEmpty() && resistance3Sit2Parallel.getText().isEmpty()) ||
               (current1Sit2Parallel.getText().isEmpty() && resistance1Sit2Parallel.getText().isEmpty()) ||
               (resistance1Sit2Parallel.getText().isEmpty() && current2Sit2Parallel.getText().isEmpty()) ||
               (resistance1Sit2Parallel.getText().isEmpty() && current3Sit2Parallel.getText().isEmpty()) ||
               (current1Sit2Parallel.getText().isEmpty()&& resistance2Sit2Parallel.getText().isEmpty()) ||
               (current1Sit2Parallel.getText().isEmpty()&& resistance3Sit2Parallel.getText().isEmpty()) ||
               (current2Sit2Parallel.getText().isEmpty()&& resistance3Sit2Parallel.getText().isEmpty()) ||
               (current3Sit2Parallel.getText().isEmpty()&& resistance3Sit2Parallel.getText().isEmpty()) ||
               (current3Sit2Parallel.getText().isEmpty()&& resistance2Sit2Parallel.getText().isEmpty()) ||
               (current2Sit2Parallel.getText().isEmpty()&& resistance2Sit2Parallel.getText().isEmpty()))
               {
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Please enter inputs for 2 categories (battery voltage, resitances or currents)");
                    alert.showAndWait();
       }
       
       //if battery and current missing
        else if (batValueSit2Parallel.getText().isEmpty() && current1Sit2Parallel.getText().isEmpty() && current2Sit2Parallel.getText().isEmpty()&& current3Sit2Parallel.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Battery Voltage or Currents for Resistors 1, 2 and 3");
            alert.showAndWait();
       }
       
       
       //if battery and resistors missing
       else if (batValueSit2Parallel.getText().isEmpty() && resistance1Sit2Parallel.getText().isEmpty()
               && resistance2Sit2Parallel.getText().isEmpty()&& resistance3Sit2Parallel.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Battery Voltage or Resistances 1, 2 and 3");
            alert.showAndWait();
           
       }
       //if current and resistors missing
       
       else if (current1Sit2Parallel.getText().isEmpty() && current2Sit2Parallel.getText().isEmpty()&& current3Sit2Parallel.getText().isEmpty()&& resistance1Sit2Parallel.getText().isEmpty()
               && resistance2Sit2Parallel.getText().isEmpty()&& resistance3Sit2Parallel.getText().isEmpty()){           
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Currents for Resistors 1, 2 and 3 or Resistances 1, 2 and 3");
            alert.showAndWait();
       
    }
       
       
       //RESULT IF HAVE VOLTAGE AND CURRENT
       else if ((current1Sit2Parallel.getText().isEmpty()==false)&& (current2Sit2Parallel.getText().isEmpty()==false) && (current3Sit2Parallel.getText().isEmpty()==false) && (batValueSit2Parallel.getText().isEmpty()==false)){
           double resistance1 = (batParallel2.getVoltage() / res1Parallel2.getCurrent());
           double resistance2 = (batParallel2.getVoltage() / res2Parallel2.getCurrent());
           double resistance3 = (batParallel2.getVoltage() / res3Parallel2.getCurrent());
           labelRes1Sit2Parallel.setText(resistance1+" Ohm");
           labelRes2Sit2Parallel.setText(resistance2+" Ohm");
           labelRes3Sit2Parallel.setText(resistance3+" Ohm");
       }
       
       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false) && (resistance3Sit2Parallel.getText().isEmpty()==false)&& (batValueSit2Parallel.getText().isEmpty()==false)){
           double current1 = (batParallel2.getVoltage() / res1Parallel2.getResistance());
           double current2 = (batParallel2.getVoltage() / res2Parallel2.getResistance());
           double current3 = (batParallel2.getVoltage() / res3Parallel2.getResistance());
           
           labelCur1Sit2Parallel.setText(current1+" A");
           labelCur2Sit2Parallel.setText(current2+" A");
           labelCur3Sit2Parallel.setText(current3+" A");
       }
       
       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit2Parallel.getText().isEmpty()==false)&& (current2Sit2Parallel.getText().isEmpty()==false) && (current3Sit2Parallel.getText().isEmpty()==false)
               && (resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false)&& (resistance3Sit2Parallel.getText().isEmpty()==false)){
           
           double voltage1 = (res1Parallel2.getResistance() * res1Parallel2.getCurrent());
           double voltage2 = (res2Parallel2.getResistance() * res2Parallel2.getCurrent());
           double voltage3 = (res3Parallel2.getResistance() * res3Parallel2.getCurrent());
           
           double voltageTotal = voltage1 + voltage2 +voltage3;
           labelBatSit2Parallel.setText(voltageTotal+" V");
       }
    }
    
    public void handleStepsSit2Parallel(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label steps = new Label();
        steps.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(steps, 0, 0);
        
    //RESULT IF HAVE VOLTAGE AND CURRENT
           if ((current1Sit2Parallel.getText().isEmpty()==false)&& (current2Sit2Parallel.getText().isEmpty()==false) && (current3Sit2Parallel.getText().isEmpty()==false)&& (batValueSit2Parallel.getText().isEmpty()==false)){
               steps.setText(" In order to find the resistance of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " V = "+batParallel2.getVoltage()+" V\n"
                       + " I1 = "+res1Parallel2.getCurrent()+" A\n"
                       + " I2 = "+res2Parallel2.getCurrent()+" A\n"
                       + " I3 = "+res3Parallel2.getCurrent()+" A\n\n"
                       + " R1 = V/I1 = "+(batParallel2.getVoltage() / res1Parallel2.getCurrent())+" Ohm\n"
                       + " R2 = V/I2 = "+(batParallel2.getVoltage() / res2Parallel2.getCurrent())+" Ohm\n"
                       + " R3 = V/I3 = "+(batParallel2.getVoltage() / res3Parallel2.getCurrent())+" Ohm\n");     
       }
       
       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false) && (resistance3Sit2Parallel.getText().isEmpty()==false)&& (batValueSit2Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the current of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " V = "+batParallel2.getVoltage()+" V\n"
                       + " R1 = "+res1Parallel2.getResistance()+" Ohm\n"
                       + " R2 = "+res2Parallel2.getResistance()+" Ohm\n"
                       + " R3 = "+res3Parallel2.getResistance()+" Ohm\n\n"
                       + " I1 = V/R1 = "+(batParallel2.getVoltage() / res1Parallel2.getResistance())+" A\n"
                       + " I2 = V/R2 = "+(batParallel2.getVoltage() / res2Parallel2.getResistance())+" A\n"
                       + " I3 = V/R3 = "+(batParallel2.getVoltage() / res3Parallel2.getResistance())+" A\n");
           
       }
       
       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit2Parallel.getText().isEmpty()==false)&& (current2Sit2Parallel.getText().isEmpty()==false) && (current3Sit2Parallel.getText().isEmpty()==false)
               && (resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false)&& (resistance3Sit2Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the voltage,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " I1 = "+res1Parallel2.getCurrent()+" A\n"
                       + " I2 = "+res2Parallel2.getCurrent()+" A\n"
                       + " I3 = "+res3Parallel2.getCurrent()+" A\n"
                       + " R1 = "+res1Parallel2.getResistance()+" Ohm\n"
                       + " R2 = "+res2Parallel2.getResistance()+" Ohm\n"
                       + " R3 = "+res3Parallel2.getResistance()+" Ohm\n\n"
                       + " V1 = I1*R1 = "+(res1Parallel2.getResistance() * res1Parallel2.getCurrent())+" V\n"
                       + " V2 = I2*R2 = "+(res2Parallel2.getResistance() * res2Parallel2.getCurrent())+" V\n"
                       + " V3 = I3*R3 = "+(res3Parallel2.getResistance() * res3Parallel2.getCurrent())+" V\n"
                       + " V = V1+V2+V3 = "+((res1Parallel2.getResistance() * res1Parallel2.getCurrent())+(res2Parallel2.getResistance() * res2Parallel2.getCurrent()+ (res3Parallel2.getResistance() * res3Parallel2.getCurrent())))+" V\n");
           

       }
        Scene scene = new Scene(layout, 520, 400);  
        stage.setTitle("Steps");
        stage.setScene(scene);
        stage.show();
        
    }
        
        
        
        
        public void Info(){
            /*Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            
            GridPane layout = new GridPane();
              
            
            Label infoDrag = new Label(" Press the mouse's left button on the \n Circuit Element and move in order to drag.\n ");
            Label infoRotate = new Label(" Double click the mouse's left button\n on the Circuit Element to rotate it.\n ");
            Label infoChange = new Label(" Press the mouse's right button on the \n Circuit Element to be able to change its properties.\n ");
            
            infoDrag.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
            infoRotate.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
            infoChange.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
            
            layout.add(infoDrag, 0,0);
            layout.add(infoRotate, 0,1);
            layout.add(infoChange, 0,2);
            
            Scene scene = new Scene(layout, 520, 300);  
         
            stage.setTitle("Info");
            stage.setScene(scene);
            stage.show();*/
        }
        

        //Exceptions Situation1 Series
   
    
        
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
         

  
    }


}


