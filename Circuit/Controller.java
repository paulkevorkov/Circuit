/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circuit;


import java.io.IOException;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
String path = "file:///C:/Users/paulk/OneDrive/Documents/NetBeansProjects/Circuit/Resources/Circuit/";

@FXML Button GoMenu, GoSeries1, GoSeries2, GoSeries3, GoParallel1,GoParallel2;

@FXML Button SetBatSit1Series, SetResSit1Series, SetCurrentSit1Series;
@FXML Button SetBatSit2Series, SetRes1Sit2Series, SetRes2Sit2Series, SetVolt1Sit2Series, SetVolt2Sit2Series, SetCurSit2Series;
@FXML Button SetBatSit3Series, SetRes1Sit3Series, SetRes2Sit3Series, SetRes3Sit3Series, SetVolt1Sit3Series, SetVolt2Sit3Series, SetVolt3Sit3Series;
@FXML Button SetBatSit1Parallel, SetRes1Sit1Parallel, SetRes2Sit1Parallel, SetCur1Sit1Parallel,SetCur2Sit1Parallel;
@FXML Button SetBatSit2Parallel, SetRes1Sit2Parallel, SetRes2Sit2Parallel, SetRes3Sit2Parallel,SetCur1Sit2Parallel, SetCur2Sit2Parallel, SetCur3Sit2Parallel;

@FXML TextField batValueSit1Series, resistanceSit1Series, currentSit1Series;
@FXML TextField batValueSit2Series, resistance1Sit2Series, resistance2Sit2Series, voltage1Sit2Series, voltage2Sit2Series, currentSit2Series;
@FXML TextField batValueSit3Series, resistance1Sit3Series, resistance2Sit3Series, resistance3Sit3Series, voltage1Sit3Series, voltage2Sit3Series, voltage3Sit3Series, currentSit3Series;
@FXML TextField batValueSit1Parallel, resistance1Sit1Parallel,resistance2Sit1Parallel, current1Sit1Parallel, current2Sit1Parallel;
@FXML TextField batValueSit2Parallel, resistance1Sit2Parallel,resistance2Sit2Parallel,resistance3Sit2Parallel, current1Sit2Parallel, current2Sit2Parallel, current3Sit2Parallel;

@FXML Label labelBatSit1Series, labelResSit1Series, labelCurSit1Series, labelVoltSit1Series;
@FXML Label labelBatSit2Series, labelRes1Sit2Series, labelRes2Sit2Series, labelVolt1Sit2Series, labelVolt2Sit2Series, labelCurSit2Series;
@FXML Label labelBatSit3Series, labelRes1Sit3Series, labelRes2Sit3Series, labelRes3Sit3Series, labelVolt1Sit3Series, labelVolt2Sit3Series, labelVolt3Sit3Series, labelCurSit3Series;
@FXML Label labelBatSit1Parallel, labelRes1Sit1Parallel, labelRes2Sit1Parallel, labelCur1Sit1Parallel, labelCur2Sit1Parallel;
@FXML Label labelBatSit2Parallel, labelRes1Sit2Parallel, labelRes2Sit2Parallel, labelRes3Sit2Parallel, labelCur1Sit2Parallel, labelCur2Sit2Parallel, labelCur3Sit2Parallel;


//CHANGE SCENES

public void switchToSeries1() throws IOException {
    URL url = new URL(path + "Series_Situation_1.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries1.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToSeries2() throws IOException {
    URL url = new URL(path + "Series_Situation_2.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries2.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToSeries3() throws IOException {
    URL url = new URL(path + "Series_Situation_3.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries3.getScene().getWindow();
    window.setScene(new Scene(root));
}
public void switchToParallel1() throws IOException {
    URL url = new URL(path + "Parallel_Situation_1.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoParallel1.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToParallel2() throws IOException {
    URL url = new URL(path + "Parallel_Situation_2.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoParallel2.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToMenu() throws IOException {
    URL url = new URL(path + "Circuit_Builder_Menu.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoMenu.getScene().getWindow();
    window.setScene(new Scene(root));
}

 
        
        
        
        
Alert alert = new Alert(Alert.AlertType.NONE);
    
//HANDLE INPUT VALUES
    
    //SITUATION 1 SERIES INPUTS
    Battery batSeries1 = new Battery();
    Resistor resSeries1 = new Resistor();
    
    public void setBatValueSit1Series() {
        try{
            double voltage = Double.parseDouble(batValueSit1Series.getText());
            batSeries1.setVoltage(voltage);
            resSeries1.setVoltage(voltage);
            labelBatSit1Series.setText(batSeries1.getVoltage()+" V");
            labelVoltSit1Series.setText(batSeries1.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }                
        } catch (NumberFormatException ex){
            if (batValueSit1Series.getText().isEmpty()){
                labelBatSit1Series.setText(labelBatSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
                alert.showAndWait();
            }
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
            labelResSit1Series.setText(resSeries1.getResistance() + " Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (resistanceSit1Series.getText().isEmpty()){
                labelResSit1Series.setText(labelResSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as resistance value !");
                alert.showAndWait();
            }
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }

    public void setCur1ValueSit1Series() {
        try{
            double current1 = Double.parseDouble(currentSit1Series.getText());
            resSeries1.setCurrent(current1);
            labelCurSit1Series.setText(currentSit1Series.getText()+" A");
            if (current1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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

    public void setBatValueSit2Series() { ////////////////////////////////////////////////
        try{
            double voltage = Double.parseDouble(batValueSit2Series.getText());
            batSeries2.setVoltage(voltage);
            labelBatSit2Series.setText(batSeries2.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number higher than 0 as voltage value !");
            alert.showAndWait();
        }
    }

    public void setRes1ValueSit2Series() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit2Series.getText());
            res1Series2.setResistance(resist1);
            labelRes1Sit2Series.setText(res1Series2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }

    public void setRes2ValueSit2Series() {
        try{
            double resist1 = Double.parseDouble(resistance2Sit2Series.getText());
            res2Series2.setResistance(resist1);
            labelRes2Sit2Series.setText(res2Series2.getResistance()+"Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setVolt1ValueSit2Series() {
        try{
            double voltage1 = Double.parseDouble(voltage1Sit2Series.getText());
            res1Series2.setVoltage(voltage1);
            labelVolt1Sit2Series.setText(voltage1Sit2Series.getText()+" V");
            if (voltage1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    public void setVolt2ValueSit2Series() {
        try{
            double voltage2 = Double.parseDouble(voltage2Sit2Series.getText());
            res2Series2.setVoltage(voltage2);
            labelVolt2Sit2Series.setText(voltage2Sit2Series.getText()+" V");
            if (voltage2 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    
    public void setCurValueSit2Series() {
        try{
            double current = Double.parseDouble(currentSit2Series.getText());
            res1Series2.setCurrent(current);
            res2Series2.setCurrent(current);
            labelCurSit2Series.setText(currentSit2Series.getText()+" A");
            if (current < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }
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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setVolt1ValueSit3Series() {
        try{
            double voltage1 = Double.parseDouble(voltage1Sit3Series.getText());
            res1Series3.setVoltage(voltage1);
            labelVolt1Sit3Series.setText(voltage1Sit3Series.getText()+" V");
            if (voltage1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    
    public void setVolt2ValueSit3Series() {
        try{
            double voltage2 = Double.parseDouble(voltage2Sit3Series.getText());
            res2Series3.setVoltage(voltage2);
            labelVolt2Sit3Series.setText(voltage2Sit3Series.getText()+" V");
            if (voltage2 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
    
    public void setVolt3ValueSit3Series() {
        try{
            double voltage3 = Double.parseDouble(voltage3Sit3Series.getText());
            res3Series3.setVoltage(voltage3);
            labelVolt3Sit3Series.setText(voltage3Sit3Series.getText()+" V");
            if (voltage3 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
                
    public void setCurValueSit3Series() {
        try{
            double current = Double.parseDouble(currentSit3Series.getText());
            res1Series3.setCurrent(current);
            res2Series3.setCurrent(current);
            res3Series3.setCurrent(current);
            labelCurSit3Series.setText(currentSit3Series.getText()+" A");
            if (current < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }
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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }
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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }
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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setRes3ValueSit2Parallel() {
        try{
            double resist1 = Double.parseDouble(SetRes3Sit2Parallel.getText());
            res3Parallel2.setResistance(resist1);
            labelRes3Sit2Parallel.setText(res3Parallel2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId());
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

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
            if (currentSit1Series.getText().isEmpty()){
                labelCurSit1Series.setText(labelCurSit1Series.getId()); ///////// change labels and text fields
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as current value !");
                alert.showAndWait();
            }

        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as current value !");
            alert.showAndWait();
        }
    }
        

    // PROVIDE OUTPUTS AND EXPLANATIONS
    
    // SITUATION 1 
    static boolean boolVoltSit1 = false;
    static boolean boolResSit1 = false;
    static boolean boolCurSit1 = false;
    
    public void handleCalculateSit1(){   
        
        // No input at all
        if (batValueSit1Series.getText().isEmpty() && resistanceSit1Series.getText().isEmpty() && currentSit1Series.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for 2 categories (Voltage, Resistance, Current)");
            alert.showAndWait();
        }
        
        // No input for voltage and resistance
        else if (batValueSit1Series.getText().isEmpty() && resistanceSit1Series.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Voltage or for Resistance");
            alert.showAndWait();
        }
        
        // No input for resistance and current
        else if (resistanceSit1Series.getText().isEmpty() && currentSit1Series.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Current or for Resistance");
            alert.showAndWait();
        }
        
        // No input for current and voltage
        else if (currentSit1Series.getText().isEmpty() && batValueSit1Series.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for Voltage or for Current");
            alert.showAndWait();
        }
        
        else{
            // V = IR
            if (batValueSit1Series.getText().isEmpty()){
                resSeries1.setVoltage(resSeries1.getCurrent()*resSeries1.getResistance());
                labelBatSit1Series.setText(String.format("%.3f", resSeries1.getVoltage())+" V");
                labelVoltSit1Series.setText(String.format("%.3f", resSeries1.getVoltage())+" V");
                boolVoltSit1 = true;
            }
            
            // R = V/I
            else if (resistanceSit1Series.getText().isEmpty()){
                resSeries1.setResistance(resSeries1.getVoltage()/resSeries1.getCurrent());
                labelResSit1Series.setText(String.format("%.3f", resSeries1.getResistance())+" Ohm");
                boolResSit1 = true;
            }
            
            // I = V/R
            else if (currentSit1Series.getText().isEmpty()){
                resSeries1.setCurrent(resSeries1.getVoltage()/resSeries1.getResistance());
                labelCurSit1Series.setText(String.format("%.3f", resSeries1.getCurrent())+" A");
                boolCurSit1 = true;
            }
        }
    }
    
    public void handleStepsSit1(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();        
        Label steps = new Label();
        steps.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(steps, 0,0);
        if (boolVoltSit1){
            steps.setText(
                "The resistance value of the resistor is:  " + resSeries1.getResistance() + " Ohm\n"
                + "The current of the circuit is: " + resSeries1.getCurrent()+" A\n\n"
                + "By applying Ohm's law (V = IR) we get: " + "\n" 
                + "Voltage = " + resSeries1.getCurrent() + "*" + resSeries1.getResistance() + " V\n"
                + "Voltage = " + resSeries1.getVoltage() + " V");  
        }
        else if (boolResSit1){
            steps.setText(
                "The voltage of the battery is:  " + batSeries1.getVoltage() + " V\n"
                + "The current of the circuit is: " + resSeries1.getCurrent()+" A\n\n"
                + "By applying Ohm's law (V = IR so R = V/I) we get: " + "\n" 
                + "Resistance = " + batSeries1.getVoltage() + "/" + resSeries1.getCurrent() + " Ohms\n"
                + "Resistance = " + resSeries1.getResistance() + " Ohms");  
        }
        else if (boolCurSit1){
            steps.setText(
                "The voltage of the battery is :  " + batSeries1.getVoltage() + " V\n"
                + "The resistance value of the resistor is:  " + resSeries1.getResistance() + " Ohm\n\n"
                + "By applying Ohm's law (V = IR so I = V/R) we get: " + "\n" 
                + "Current = " + resSeries1.getVoltage() + "*" + resSeries1.getResistance() + " A\n"
                + "Current = " + resSeries1.getCurrent() + " A");  
        }
        Scene scene = new Scene(layout, 520, 400);  
        stage.setTitle("Info");
        stage.setScene(scene);
        stage.show();
    }
        /*
    labelBatSit1Series, labelResSit1Series, labelCurSit1Series;
    */
   /*batValueSit1Series, resistanceSit1Series, currentSit1Series;*/
   
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
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
         

  
    }


}


