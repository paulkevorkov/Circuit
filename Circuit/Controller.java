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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Controller implements Initializable {
String path = "file:///C:/Users/paulk/OneDrive/Documents/NetBeansProjects/Circuit/Resources/";

@FXML Button GoMenu, GoSeries1, GoSeries2, GoSeries3, GoParallel1,GoParallel2;
@FXML Button CurrentUnknown, ResistorUnknown, VoltageUnknown, Help, SeriesHelp, ParallelHelp, EquivalentResistorParallelHelp1, EquivalentResistorParallelHelp2, EquivalentResistorSeriesHelp1, EquivalentResistorSeriesHelp2;
@FXML Button ResistorInfo, BatteryInfo;

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

@FXML Label labelReqSit2Series, labelReqSit3Series, labelReqSit1Parallel, labelReqSit2Parallel;


//CHANGE SCENES

public void switchToSeries1() throws IOException {
    URL url = new URL(path + "Circuit/Series_Situation_1.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries1.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToSeries2() throws IOException {
    URL url = new URL(path + "Circuit/Series_Situation_2.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries2.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToSeries3() throws IOException {
    URL url = new URL(path + "Circuit/Series_Situation_3.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoSeries3.getScene().getWindow();
    window.setScene(new Scene(root));
}
public void switchToParallel1() throws IOException {
    URL url = new URL(path + "Circuit/Parallel_Situation_1.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoParallel1.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToParallel2() throws IOException {
    URL url = new URL(path + "Circuit/Parallel_Situation_2.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoParallel2.getScene().getWindow();
    window.setScene(new Scene(root));
}

public void switchToMenu() throws IOException {
    URL url = new URL(path + "Circuit/Circuit_Builder_Menu.fxml");
    Parent root = FXMLLoader.load(url);
    
    Stage window = (Stage) GoMenu.getScene().getWindow();
    window.setScene(new Scene(root));
}

 
       
// EDUCATION BUTTONS
public void currentUnknown(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoCurrent = new Label(" To find the unknown current, you need to input \n the resistance for  all resistors and also \n input the voltage in the circuit. ");  
        infoCurrent.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoCurrent, 0,0);
        Scene scene = new Scene(layout, 520, 85);  
        stage.setTitle("Current Info");
        stage.setScene(scene);
        stage.show();
    }
    public void resistorUnknown(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoResistor = new Label(" To find the unknown resistor, you need to input \n the current and the voltage in the circuit. ");  
        infoResistor.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoResistor, 0,0);
        Scene scene = new Scene(layout, 520, 60);  
        stage.setTitle("Resistor Info");
        stage.setScene(scene);
        stage.show();
    }
    public void voltageUnknown(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoVoltage = new Label(" To find the unknown voltage, you need to input \n the resistance for  all resistors and also \n input the current in the circuit. ");  
        infoVoltage.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoVoltage, 0,0);
        Scene scene = new Scene(layout, 520, 85);  
        stage.setTitle("Voltage Info");
        stage.setScene(scene);
        stage.show();
    }
    public void helpButton(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label helpButton = new Label(" To use this program, you must enter values\n for 2 out of the 3 components: \n resistance, voltage or current\n\n"
                + " Then you press the 'Calculate Unknowns button'\n  which will give you the value that is missing. ");  
        helpButton.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(helpButton, 0,0);
        Scene scene = new Scene(layout, 520, 200);  
        stage.setTitle("Help Info");
        stage.setScene(scene);
        stage.show();
    }
    public void basicHelp(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoSeries = new Label(" This is a basic circuit containing \n a battery and a single resistor.\n\n  It is what the Equivalent Resistor (Req)\n of a circuit in series or in parallel looks like.\n");  
        infoSeries.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoSeries, 0,0);
        Scene scene = new Scene(layout, 450, 200);  
        stage.setTitle("Basic Circuit Info");
        stage.setScene(scene);
        stage.show();
    }
    public void seriesHelp(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoSeries = new Label(" A series circuit is an electric circuit \n in which the  electric passes through \n each circuit element in order. ");  
        infoSeries.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoSeries, 0,0);
        Scene scene = new Scene(layout, 400, 100);  
        stage.setTitle("Series Info");
        stage.setScene(scene);
        stage.show();
    }
    public void parallelHelp(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoParallel = new Label("A parallel circuit comprises branches so \n that the current divides and only part \n of it flows through any branch. ");  
        infoParallel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoParallel, 0,0);
        Scene scene = new Scene(layout, 400, 100);  
        stage.setTitle("Parallel Info");
        stage.setScene(scene);
        stage.show();
    }
    public void equivalentResistorParallelHelp1(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoEquivalentResistor = new Label("The equivalent resistor is the resistance in \nthe entire circuit written as Req \n\nFor a circuit in parallel: 1/Req = 1/R1 + 1/R2");  
        infoEquivalentResistor.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoEquivalentResistor, 0,0);
        Scene scene = new Scene(layout, 550, 150);  
        stage.setTitle("Equivalent resistor in Parallel Info");
        stage.setScene(scene);
        stage.show();
    }
     public void equivalentResistorParallelHelp2(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoEquivalentResistor = new Label("The equivalent resistor is the resistance in \nthe entire circuit written as Req \n\nFor a circuit in parallel: 1/Req = 1/R1 + 1/R2 + 1/R3");  
        infoEquivalentResistor.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoEquivalentResistor, 0,0);
        Scene scene = new Scene(layout, 550, 150);  
        stage.setTitle("Equivalent resistor in Parallel Info");
        stage.setScene(scene);
        stage.show();
    }
     public void equivalentResistorSeriesHelp1(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoEquivalentResistor = new Label("The equivalent resistor is the resistance in \nthe entire circuit written as Req \n\nFor a circuit in series: Req = R1 + R2");  
        infoEquivalentResistor.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoEquivalentResistor, 0,0);
        Scene scene = new Scene(layout, 550, 150);  
        stage.setTitle("Equivalent resistor in Series Info");
        stage.setScene(scene);
        stage.show();
     }
     public void equivalentResistorSeriesHelp2(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoEquivalentResistor = new Label("The equivalent resistor is the resistance in \nthe entire circuit written as Req \n\nFor a circuit in series: Req = R1 + R2 + R3");  
        infoEquivalentResistor.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoEquivalentResistor, 0,0);
        Scene scene = new Scene(layout, 550, 150);  
        stage.setTitle("Equivalent resistor in Series Info");
        stage.setScene(scene);
        stage.show();
     }
     public void resistorInfo(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoResistor = new Label("A resistor is an electrical component \nthat limits or regulates the flow of \nelectrical current in an electronic circuit.\nThe conventional symbol for it is the following:\n\n\n");  
        infoResistor.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        ImageView image = new ImageView( new Image(path+"resistor image.png"));
        layout.add(infoResistor, 0,0);
        layout.add(image, 0, 1);
        Scene scene = new Scene(layout, 500, 200);  
        stage.setTitle("Resistor Info");
        stage.setScene(scene);
        stage.show();
     }
     public void batteryInfo(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoBattery = new Label("The battery's role in a circuit is all about \ndoing work and providing energy.\nThe conventional symbol for it is the following:\n\n\n");  
        infoBattery.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        ImageView image = new ImageView( new Image(path+"battery image.png"));
        layout.add(infoBattery, 0,0);
        layout.add(image, 0, 1);
        Scene scene = new Scene(layout, 500, 200);  
        stage.setTitle("Battery Info");
        stage.setScene(scene);
        stage.show();
     }
     public void circuitCurrentSeriesHelp(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoBattery = new Label("In a circuit in series, the value \nof the current (in Amperes) \nin every resistor is the same");  
        infoBattery.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoBattery, 0,0);
        Scene scene = new Scene(layout, 450, 200);  
        stage.setTitle("Current in Series Info");
        stage.setScene(scene);
        stage.show();
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
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }                
        } catch (NumberFormatException ex){
            if (batValueSit1Series.getText().isEmpty()){
                labelBatSit1Series.setText("VOLTAGE");
                
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
                labelResSit1Series.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
                labelCurSit1Series.setText("CURRENT");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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

    public void setBatValueSit2Series() {
        try{
            double voltage = Double.parseDouble(batValueSit2Series.getText());
            batSeries2.setVoltage(voltage);
            labelBatSit2Series.setText(batSeries2.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (batValueSit2Series.getText().isEmpty()){
                labelBatSit2Series.setText("VOLTAGE");
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
    public void setRes1ValueSit2Series() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit2Series.getText());
            res1Series2.setResistance(resist1);
            labelRes1Sit2Series.setText(res1Series2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (resistance1Sit2Series.getText().isEmpty()){
                labelRes1Sit2Series.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            labelRes2Sit2Series.setText(res2Series2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (resistance2Sit2Series.getText().isEmpty()){
                labelRes2Sit2Series.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (voltage1Sit2Series.getText().isEmpty()){
                labelVolt1Sit2Series.setText("VOLTAGE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (voltage2Sit2Series.getText().isEmpty()){
                labelVolt2Sit2Series.setText("VOLTAGE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (currentSit2Series.getText().isEmpty()){
                labelCurSit2Series.setText("... A");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (batValueSit3Series.getText().isEmpty()){
                labelBatSit3Series.setText("VOLTAGE");
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
    public void setRes1ValueSit3Series() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit3Series.getText());
            res1Series3.setResistance(resist1);
            labelRes1Sit3Series.setText(res1Series3.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
}   
        } catch (NumberFormatException ex){
            if (resistance1Sit3Series.getText().isEmpty()){
                labelRes1Sit3Series.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (resistance2Sit3Series.getText().isEmpty()){
                labelRes2Sit3Series.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (resistance3Sit3Series.getText().isEmpty()){
                labelRes3Sit3Series.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (voltage1Sit3Series.getText().isEmpty()){
                labelVolt1Sit3Series.setText("VOLTAGE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (voltage2Sit3Series.getText().isEmpty()){
                labelVolt2Sit3Series.setText("VOLTAGE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (voltage3Sit3Series.getText().isEmpty()){
                labelVolt3Sit3Series.setText("VOLTAGE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (currentSit3Series.getText().isEmpty()){
                labelCurSit3Series.setText("... A");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            res1Parallel1.setVoltage(voltage);
            res2Parallel1.setVoltage(voltage);
            labelBatSit1Parallel.setText(batParallel1.getVoltage()+" V");
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (batValueSit1Parallel.getText().isEmpty()){
                labelBatSit1Parallel.setText("VOLTAGE");
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
    public void setRes1ValueSit1Parallel() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit1Parallel.getText());
            res1Parallel1.setResistance(resist1);
            labelRes1Sit1Parallel.setText(res1Parallel1.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (resistance1Sit1Parallel.getText().isEmpty()){
                labelRes1Sit1Parallel.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (resistance2Sit1Parallel.getText().isEmpty()){
                labelRes2Sit1Parallel.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (current1Sit1Parallel.getText().isEmpty()){
                labelCur1Sit1Parallel.setText("CURRENT");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (current2Sit1Parallel.getText().isEmpty()){
                labelCur2Sit1Parallel.setText("CURRENT");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            res1Parallel2.setVoltage(voltage);
            res2Parallel2.setVoltage(voltage);
            res3Parallel2.setVoltage(voltage);            
            labelBatSit2Parallel.setText(batParallel2.getVoltage()+" V");
	if (voltage <= 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (batValueSit2Parallel.getText().isEmpty()){
                labelBatSit2Parallel.setText("VOLTAGE");
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
    public void setRes1ValueSit2Parallel() {
        try{
            double resist1 = Double.parseDouble(resistance1Sit2Parallel.getText());
            res1Parallel2.setResistance(resist1);
            labelRes1Sit2Parallel.setText(res1Parallel2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (resistance1Sit2Parallel.getText().isEmpty()){
                labelRes1Sit2Parallel.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (resistance2Sit2Parallel.getText().isEmpty()){
                labelRes2Sit2Parallel.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            double resist1 = Double.parseDouble(resistance3Sit2Parallel.getText());
            res3Parallel2.setResistance(resist1);
            labelRes3Sit2Parallel.setText(res3Parallel2.getResistance()+" Ohm");
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            if (resistance3Sit2Parallel.getText().isEmpty()){
                labelRes3Sit2Parallel.setText("RESISTANCE");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (current1Sit2Parallel.getText().isEmpty()){
                labelCur1Sit2Parallel.setText("CURRENT");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (current2Sit2Parallel.getText().isEmpty()){
                labelCur2Sit2Parallel.setText("CURRENT");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
            if (current3Sit2Parallel.getText().isEmpty()){
                labelCur3Sit2Parallel.setText("CURRENT");
            }else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter a number as voltage value !");
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
    
    // BASIC SITUATION
    
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
        
        // all filled
        else if (!currentSit1Series.getText().isEmpty() && !batValueSit1Series.getText().isEmpty() && !resistanceSit1Series.getText().isEmpty()){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for only 2 of the 3 categories (Voltage, Resistance, Current)");
            alert.showAndWait();
        }
        
        else{
            // V = IR
            if (batValueSit1Series.getText().isEmpty()){
                batSeries1.setVoltage(resSeries1.getCurrent()*resSeries1.getResistance());
                labelBatSit1Series.setText(String.format("%.3f", batSeries1.getVoltage())+" V");
            }
            
            // R = V/I
            else if (resistanceSit1Series.getText().isEmpty()){
                resSeries1.setResistance(resSeries1.getVoltage()/resSeries1.getCurrent());
                labelResSit1Series.setText(String.format("%.3f", resSeries1.getResistance())+" Ohm");
            }
            
            // I = V/R
            else if (currentSit1Series.getText().isEmpty()){
                resSeries1.setCurrent(resSeries1.getVoltage()/resSeries1.getResistance());
                labelCurSit1Series.setText(String.format("%.3f", resSeries1.getCurrent())+" A");
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
        
        // IF VOLTAGE MISSING
        if (batValueSit1Series.getText().isEmpty()){
            steps.setText(
                "The resistance value of the resistor is:  " + resSeries1.getResistance() + " Ohm\n"
                + "The current of the circuit is: " + resSeries1.getCurrent()+" A\n\n"
                + "By applying Ohm's law (V = IR) we get: " + "\n" 
                + "Voltage = Current * Resistance\n"
                + "Voltage = " + resSeries1.getCurrent() + " A * " + resSeries1.getResistance() + " Ohm\n"
                + "Voltage = " + resSeries1.getVoltage() + " V"); 
                        
            stage.setTitle("Calculate Voltage");
        }
        
        // IF RESISTANCE MISSING
        else if (resistanceSit1Series.getText().isEmpty()){
            steps.setText(
                "The voltage of the battery is:  " + batSeries1.getVoltage() + " V\n"
                + "The current of the circuit is: " + resSeries1.getCurrent()+" A\n\n"
                + "By applying Ohm's law (V = IR so R = V/I) we get: " + "\n" 
                + "Resistance = Voltage / Current\n"
                + "Resistance = " + batSeries1.getVoltage() + " V / " + resSeries1.getCurrent() + " A\n"
                + "Resistance = " + resSeries1.getResistance() + " Ohms");  
            
            stage.setTitle("Calculate Resistance");
        }
        
        // IF CURRENT MISSING
        else if (currentSit1Series.getText().isEmpty()){
            steps.setText(
                "The voltage of the battery is :  " + batSeries1.getVoltage() + " V\n"
                + "The resistance value of the resistor is:  " + resSeries1.getResistance() + " Ohm\n\n"
                + "By applying Ohm's law (V = IR so I = V/R) we get: " + "\n" 
                + "Current = Voltage / Resistance \n"
                + "Current = " + resSeries1.getVoltage() + " V * " + resSeries1.getResistance() + " Ohm\n"
                + "Current = " + resSeries1.getCurrent() + " A");  
            
            stage.setTitle("Calculate Current");
        }
        Scene scene = new Scene(layout, 520, 400);  
        stage.setScene(scene);
        stage.show();
    }
    
    
    // SITUATION 2 SERIES 
    Resistor reqSit2Series = new Resistor();
    public void handleCalculateSit2Series(){
        
        TextField[] textFieldList = {batValueSit2Series, resistance1Sit2Series, resistance2Sit2Series, voltage1Sit2Series, voltage2Sit2Series, currentSit2Series};
        int nbEmpty = 0;
        
        for(TextField field: textFieldList){
            if (field.getText().isEmpty()){
                nbEmpty++;
            }
        }
        
        //if 6 or 5 or 4 empty
        if (nbEmpty > 4){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter inputs for 2 categories (battery voltage, resitances or currents)");
            alert.showAndWait();
        }
        
        else if (nbEmpty == 4){
            if (!batValueSit2Series.getText().isEmpty() && !currentSit2Series.getText().isEmpty()){
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Enter a combination other than Battery Voltage and Current");
                alert.showAndWait();                
            }else{                
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter inputs for 2 categories (battery voltage, resitances or currents)");
                alert.showAndWait();
            }
        }
        
        else if (nbEmpty == 3){            
            // RESULT IF HAVE BATTERY, R1 and R2
            if (!batValueSit2Series.getText().isEmpty() && !resistance1Sit2Series.getText().isEmpty() && !resistance2Sit2Series.getText().isEmpty()){
               
                // 1. Calculate Req (Req = R1+R2)
                reqSit2Series.setVoltage(batSeries2.getVoltage());
                reqSit2Series.setResistance(res1Series2.getResistance()+res2Series2.getResistance());
                
                // 2. Calculate Current (I = V/Req)
                reqSit2Series.setCurrent(reqSit2Series.getVoltage()/reqSit2Series.getResistance());
                res1Series2.setCurrent(reqSit2Series.getCurrent());
                res2Series2.setCurrent(reqSit2Series.getCurrent());
                
                // 3. Calculate V1 & V2 (V1 = I*R1,  V2 = I*R2)
                res1Series2.setVoltage(res1Series2.getCurrent()/res1Series2.getResistance());
                res2Series2.setVoltage(res2Series2.getCurrent()/res2Series2.getResistance());
                
                //set Req, V1, V2, Current labels
                labelReqSit2Series.setText(String.format("%.3f", reqSit2Series.getResistance())+" Ohm");
                labelVolt1Sit2Series.setText(String.format("%.3f", res1Series2.getVoltage())+" V");
                labelVolt2Sit2Series.setText(String.format("%.3f", res2Series2.getVoltage())+" V");
                labelCurSit2Series.setText(String.format("%.3f", res1Series2.getCurrent())+" A");
            }
                
            // RESULT IF HAVE CURRENT, R1 and R2
            else if (!currentSit2Series.getText().isEmpty()&& !resistance1Sit2Series.getText().isEmpty() && !resistance2Sit2Series.getText().isEmpty()){
                
                // 1. Calculate Req (Req = R1+R2)                
                reqSit2Series.setResistance(res1Series2.getResistance()+res2Series2.getResistance());
                
                // 2. Calculate Voltage (V = I*Req)
                reqSit2Series.setVoltage(reqSit2Series.getCurrent()*reqSit2Series.getResistance());
                batSeries2.setVoltage(res1Series2.getCurrent()*reqSit2Series.getResistance());
                
                // 3. Calculate V1 & V2 (V1 = I*R1,  V2 = I*R2)
                res1Series2.setVoltage(res1Series2.getCurrent()*res1Series2.getResistance());
                res2Series2.setVoltage(res2Series2.getCurrent()*res2Series2.getResistance());
                
                //set Req, V1, V2, batteryVoltage labels
                labelReqSit2Series.setText(String.format("%.3f", reqSit2Series.getResistance())+" Ohm");
                labelVolt1Sit2Series.setText(String.format("%.3f", res1Series2.getVoltage())+" V");
                labelVolt2Sit2Series.setText(String.format("%.3f", res2Series2.getVoltage())+" V");
                labelBatSit2Series.setText(String.format("%.3f", batSeries2.getVoltage())+" V");
            }
                
       
            // RESULT IF HAVE CURRENT, V1 and V2
            else if (!currentSit2Series.getText().isEmpty()&& !voltage1Sit2Series.getText().isEmpty() && !voltage2Sit2Series.getText().isEmpty()){
                
                //1. Calculate batteryVoltage (Vbat = V1+V2)
                batSeries2.setVoltage(res1Series2.getVoltage()+res2Series2.getVoltage());
                
                //2. Calculate R1 & R1 (R1 = V1/I, R2 = V2/I)
                res1Series2.setResistance(res1Series2.getVoltage()/res1Series2.getCurrent());
                res2Series2.setResistance(res2Series2.getVoltage()/res2Series2.getCurrent());
                
                //3. Calculate Req
                reqSit2Series.setResistance(resSeries1.getResistance()+res2Series2.getResistance());
                
                // set labels: batteryVoltage, R1, R2                
                labelReqSit2Series.setText(String.format("%.3f", reqSit2Series.getResistance())+" Ohm");
                labelBatSit2Series.setText(String.format("%.3f", batSeries2.getVoltage())+" V");
                labelRes1Sit2Series.setText(String.format("%.3f", res1Series2.getResistance())+" Ohm");                
                labelRes2Sit2Series.setText(String.format("%.3f", res2Series2.getResistance())+" Ohm");
            }
            
            // ERROR IF BATTERY VOLTAGE AND VOLTAGES ARE KNOWN
            else if(!batValueSit2Series.getText().isEmpty() && !voltage1Sit2Series.getText().isEmpty() && !voltage2Sit2Series.getText().isEmpty()){
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Enter a combination other than Battery Voltage and Voltage of Resistors");
                alert.showAndWait();
            } 
            else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter inputs for only 2 of the 4 categories (battery voltage, resistances, voltage of resistors or current)");
                alert.showAndWait();
            } 
        }
        
        else if (nbEmpty == 2){
            
            // RESULT IF HAVE R1, R2, V1, V2
            if (batValueSit2Series.getText().isEmpty()&& currentSit2Series.getText().isEmpty()){

                //1. calculate current (i = v/r)
                double i1 = res1Series2.getVoltage()/res1Series2.getResistance();
                double i2 = res2Series2.getVoltage()/res2Series2.getResistance();
                if (i1 != i2){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Don't forget that the Current in a Series Circuit is ALWAYS equal. Please verify your input !");
                    alert.showAndWait();
                }else{
                    res1Series2.setCurrent(i2);
                    res2Series2.setCurrent(i2);
                }
                
                //2. calculate batteryVoltage
                batSeries2.setVoltage(res1Series2.getVoltage()+res2Series2.getVoltage());
                
                // set labels : batteryVoltage, current
                labelReqSit2Series.setText(String.format("%.3f", reqSit2Series.getResistance())+" Ohm");
                labelBatSit2Series.setText(String.format("%.3f", batSeries2.getVoltage())+" V");
                labelCurSit2Series.setText(String.format("%.3f", res1Series2.getCurrent())+" A");
            }
            else{
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Please enter inputs for only 2 of the 4 categories (battery voltage, resistances, voltage of resistors or current)");
                alert.showAndWait();
            }
             
        }
        
        else{
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter inputs for only 2 of the 4 categories (battery voltage, resistances, voltage of resistors or current)");
            alert.showAndWait();
        }
       
    }
    
    public void handleStepsSit2Series(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label steps = new Label();
        steps.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(steps, 0, 0);
        
        //STEPS IF HAVE BATTERY, R1 and R2
        if (!batValueSit2Series.getText().isEmpty() && !resistance1Sit2Series.getText().isEmpty() && !resistance2Sit2Series.getText().isEmpty()){
            steps.setText(" The unkown values are the Current and the Voltages of the resistors\n\n"
                    + "Step 1: find the equivalent resistor to the ciruit (Req)\n"      
                    + "Req = Resistance1 + Resistance2\n"
                    + "Req = " + String.format("%.3f", res1Series2.getResistance()) +" Ohm +"+ String.format("%.3f",res2Series2.getResistance())+" Ohm\n"
                    + "Req = " + String.format("%.3f", reqSit2Series.getResistance())+ " Ohm\n\n"
                    + "Step 2: find the current of the circuit using Ohm's law (V = I*R)\n"
                    + "I = batteryVoltage / Req\n"
                    + "I = "+String.format("%.3f", batSeries2.getVoltage())+" V / "+ String.format("%.3f", reqSit2Series.getResistance())+" Ohm\n"
                    + "I = "+String.format("%.3f", res1Series2.getCurrent())+" A\n\n"
                    + "Step 3: find the voltages of the resistances using Ohm's law (V=I*R)\n"
                    + "Voltage1 = Current * Resistance1\n"
                    + "Voltage1 = " + String.format("%.3f", res1Series2.getCurrent())+" A * " + String.format("%.3f", res1Series2.getResistance())+" Ohm\n"
                    + "Voltage1 = "+String.format("%.3f", res1Series2.getVoltage())+ "V\n"
                    + "Voltage2 = Current * Resistance2\n"                    
                    + "Voltage2 = " + String.format("%.3f", res2Series2.getCurrent())+" A * " + String.format("%.3f", res2Series2.getResistance())+" Ohm\n"
                    + "Voltage2 = "+String.format("%.3f", res2Series2.getVoltage())+" V");
       }
       
       //STEPS IF HAVE CURRENT,R1 and R1
       else if (!currentSit2Series.getText().isEmpty()&& !resistance1Sit2Series.getText().isEmpty() && !resistance2Sit2Series.getText().isEmpty()){
            steps.setText(" The unkown values are the Battery Voltage and the Voltages of the Resistors\n\n"
                    + "Step 1: find the equivalent resistor to the ciruit (Req)\n"      
                    + "Req = Resistance1 + Resistance2\n"
                    + "Req = " + String.format("%.3f", res1Series2.getResistance()) +" Ohm +"+ String.format("%.3f", res2Series2.getResistance())+" Ohm\n"
                    + "Req = " + String.format("%.3f", reqSit2Series.getResistance())+ " Ohm\n\n"
                    + "Step 2: find the Battery Voltage using Ohm's law (V = I*R)\n"
                    + "batteryVoltage = Current * Req\n"
                    + "batteryVoltage = "+String.format("%.3f", res2Series2.getCurrent())+" A * "+ String.format("%.3f", reqSit2Series.getResistance())+" Ohm\n"
                    + "batteryVoltage = "+String.format("%.3f", batSeries2.getVoltage())+" V\n\n"
                    + "Step 3: find the voltages of the resistances using Ohm's law (V=I*R)\n"
                    + "Voltage1 = Current * Resistance1\n"
                    + "Voltage1 = " + String.format("%.3f", res1Series2.getCurrent())+" A * " + String.format("%.3f",res1Series2.getResistance())+" Ohm\n"
                    + "Voltage1 = "+String.format("%.3f", res1Series2.getVoltage())+ " V\n\n"
                    + "Voltage2 = Current * Resistance2\n"                    
                    + "Voltage2 = " + String.format("%.3f", res2Series2.getCurrent())+" A * " + String.format("%.3f", res2Series2.getResistance())+" Ohm\n"
                    + "Voltage2 = "+String.format("%.3f", res2Series2.getVoltage())+" V");
           
       }
       
       //STEPS IF HAVE CURRENT, V1 and V2
       else if (!currentSit2Series.getText().isEmpty()&& !voltage1Sit2Series.getText().isEmpty() && !voltage2Sit2Series.getText().isEmpty()){
            steps.setText(" The unknown values are the Battery Voltage and the Resistances of the Resistors\n\n"                   
                    + "**The sum of the voltages of resistors in series = battery voltage**"
                    + "Step 1: find the battery voltage using property of Resistors in Series\n"
                    + "batteryVoltage = voltage1 + voltage2\n"
                    + "batteryVoltage = "+String.format("%.3f", res1Series2.getVoltage())+" V + "+ String.format("%.3f", res2Series2.getVoltage())+" V\n"
                    + "batteryVoltage = "+String.format("%.3f", batSeries2.getVoltage())+" V\n\n"
                    + "Step 2: find the resistances of the resistances using Ohm's law (V=I*R)\n"
                    + "Resistance1 = Voltage1 / Current\n"
                    + "Resistance1 = " + String.format("%.3f", res1Series2.getVoltage())+" V / " + String.format("%.3f", res1Series2.getCurrent())+" A\n"
                    + "Resistance1 = "+ String.format("%.3f", res1Series2.getResistance())+ "Ohm\n\n"
                    + "Resistance2 = Voltage2 / Current\n"                    
                    + "Resistance2 = " + String.format("%.3f", res2Series2.getVoltage())+" V / " + String.format("%.3f", res2Series2.getCurrent())+" A\n"
                    + "Resistance2 = "+String.format("%.3f", res2Series2.getResistance())+" Ohm");
                   }
       
       // STEPS IF HAVE R1, R2, V1, V2
        else if (batValueSit2Series.getText().isEmpty()&& currentSit2Series.getText().isEmpty()){
            double i1 = res1Series2.getVoltage()/res1Series2.getResistance();
            double i2 = res2Series2.getVoltage()/res2Series2.getResistance();
            if (i1 != i2){
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("Don't forget that the Current in a Series Circuit is ALWAYS equal. Please verify your input !");
                alert.showAndWait();
            }else{
            steps.setText(" The unknown values are the Battery Voltage and the Circuit Current\n"
                    + "**The sum of the voltages of resistors in series = battery voltage**\n"
                    + "Step 1: find the battery voltage using property of Resistors in Series\n"
                    + "batteryVoltage = voltage1 + voltage2\n"
                    + "batteryVoltage = "+String.format("%.3f", res1Series2.getVoltage())+" V + "+ String.format("%.3f", res2Series2.getVoltage())+" V\n"
                    + "batteryVoltage = "+String.format("%.3f", batSeries2.getVoltage())+" V\n\n"
                    + "Step 2: find the Equivalent Resistor (Req)\n"
                    + "Req = Resistance1 + Resistance2\n"
                    + "Req = " + String.format("%.3f", res1Series2.getResistance()) +" Ohm +"+ String.format("%.3f", res1Series2.getResistance())+" Ohm\n"
                    + "Req = " + String.format("%.3f", reqSit2Series.getResistance())+ " Ohm\n\n"
                    + "Step 3: find the Circuit Current using Ohm's law (V=I*R)\n"
                    + "I = batteryVoltage / Req\n"
                    + "I = "+String.format("%.3f", batSeries2.getVoltage())+" V / "+ String.format("%.3f", reqSit2Series.getResistance())+" Ohm\n"
                    + "I = "+String.format("%.3f", res1Series2.getCurrent())+" A");  
            }
        }
        Scene scene = new Scene(layout, 800, 600);  
        stage.setTitle("Steps");
        stage.setScene(scene);
        stage.show();
        
    }
    
    
    //HANDLE CALCULATE SERIES 3
    public void handleCalculateSit3Series(){

        TextField[] textFieldList = {batValueSit3Series, resistance1Sit3Series, resistance2Sit3Series, resistance3Sit3Series, voltage1Sit3Series, voltage2Sit3Series, voltage3Sit3Series, currentSit3Series};
        int nbEmpty = 0;

        for(TextField field: textFieldList){
            if (field.getText().isEmpty()){
                nbEmpty++;
            }
        }

        //if Value entered in Battery and Resistor voltage
        if ((!batValueSit3Series.getText().isEmpty() && !voltage1Sit3Series.getText().isEmpty()) ||
           (!batValueSit3Series.getText().isEmpty() && !voltage2Sit3Series.getText().isEmpty()) ||
           (!batValueSit3Series.getText().isEmpty() && !voltage3Sit3Series.getText().isEmpty())){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Please enter inputs for ONLY 1 type of voltage");
                    alert.showAndWait();
        }
        //if more than 4 empty
        else if (nbEmpty > 4){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter inputs for 2 categories (battery voltage, resistors voltage, resistances or current)");
            alert.showAndWait();
        }

        else if (nbEmpty == 4){

           //RESULT IF HAVE RESISTOR VOLTAGE AND CURRENT 
            if ((currentSit3Series.getText().isEmpty()==false)&& (voltage1Sit3Series.getText().isEmpty()==false) && (voltage2Sit3Series.getText().isEmpty()==false) && (voltage3Sit3Series.getText().isEmpty()==false)){
                double totalvoltage = ((res1Series3.getVoltage()) + (res2Series3.getVoltage()) + (res3Series3.getVoltage()));
                double resistance1 = (res1Series3.getVoltage()/(Double.parseDouble(currentSit3Series.getText())));
                double resistance2 = (res2Series3.getVoltage()/(Double.parseDouble(currentSit3Series.getText())));
                double resistance3 = (res3Series3.getVoltage()/(Double.parseDouble(currentSit3Series.getText())));

                labelBatSit3Series.setText(String.format("%.3f",totalvoltage)+" V");
                labelRes1Sit3Series.setText(String.format("%.3f",resistance1)+" Ohm");
                labelRes2Sit3Series.setText(String.format("%.3f",resistance2)+" Ohm");
                labelRes3Sit3Series.setText(String.format("%.3f",resistance3)+" Ohm");
                
                double req = resistance1+resistance2+resistance3;
                labelReqSit3Series.setText(String.format("%.3f", req)+" Ohm");
            }

            //RESULT IF HAVE RESISTANCE AND CURRENT
            else if ((currentSit3Series.getText().isEmpty()==false)&& (resistance1Sit3Series.getText().isEmpty()==false) && (resistance2Sit3Series.getText().isEmpty()==false) && (resistance3Sit3Series.getText().isEmpty()==false)){
                double voltage1 = (res1Series3.getResistance() * (Double.parseDouble(currentSit3Series.getText())));
                double voltage2 = ((Double.parseDouble(currentSit3Series.getText())) * res2Series3.getResistance());
                double voltage3 = ((Double.parseDouble(currentSit3Series.getText())) * res3Series3.getResistance());
                double totalvoltage = voltage1+voltage2+voltage3;

                labelVolt1Sit3Series.setText(String.format("%.3f",voltage1)+" V");
                labelVolt2Sit3Series.setText(String.format("%.3f",voltage2)+" V");
                labelVolt3Sit3Series.setText(String.format("%.3f",voltage3)+" V");
                labelBatSit3Series.setText(String.format("%.3f",totalvoltage)+" V");
                
                double req = Double.parseDouble(resistance1Sit3Series.getText())+Double.parseDouble(resistance2Sit3Series.getText())+Double.parseDouble(resistance3Sit3Series.getText());
                labelReqSit3Series.setText(String.format("%.3f", req)+" Ohm");
            }

            //RESULT IF HAVE RESISTANCE AND BATTERY VOLTAGE
            else if ((batValueSit3Series.getText().isEmpty()==false)&& (resistance1Sit3Series.getText().isEmpty()==false) && (resistance2Sit3Series.getText().isEmpty()==false) && (resistance3Sit3Series.getText().isEmpty()==false)){

                double req = (res1Series3.getResistance() + res2Series3.getResistance() + res3Series3.getResistance());
                double current = (batSeries3.getVoltage()/req);
                double voltage1 = (res1Series3.getResistance() * current);
                double voltage2 = (current * res2Series3.getResistance());
                double voltage3 = (current * res3Series3.getResistance());

                labelCurSit3Series.setText(String.format("%.3f",current)+" A");
                labelVolt1Sit3Series.setText(String.format("%.3f",voltage1)+" V");
                labelVolt2Sit3Series.setText(String.format("%.3f",voltage2)+" V");
                labelVolt3Sit3Series.setText(String.format("%.3f",voltage3)+" V");
                
                labelReqSit3Series.setText(String.format("%.3f", req)+" Ohm");
            }
            else {
                 alert.setAlertType(Alert.AlertType.ERROR);
                 alert.setHeaderText("ERROR");
                 alert.setContentText("Please enter inputs for 2 categories (battery voltage, resistors voltage, resistances or current)");
                 alert.showAndWait();
            }
        }

        else if (nbEmpty == 3){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter inputs for 2 categories (battery voltage, resistors voltage, resistances or current)");
            alert.showAndWait();
        }
        
        else if (nbEmpty == 2){
            
            //RESULT IF HAVE RESISTANCE AND RESISTOR VOLTAGE
            if ((resistance1Sit3Series.getText().isEmpty()==false) && (resistance2Sit3Series.getText().isEmpty()==false) && (resistance3Sit3Series.getText().isEmpty()==false)
                && (voltage1Sit3Series.getText().isEmpty()==false) && (voltage2Sit3Series.getText().isEmpty()==false) && (voltage3Sit3Series.getText().isEmpty()==false)){

                double current1 = (res1Series3.getVoltage()/res1Series3.getResistance());
                double current2 = (res2Series3.getVoltage()/res2Series3.getResistance());
                double current3 = (res3Series3.getVoltage()/res3Series3.getResistance());
                double totalvoltage = (res1Series3.getVoltage() + res2Series3.getVoltage() + res3Series3.getVoltage());

                if (current1 != current2 || current1!= current3 || current2 != current3){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Don't forget that the Current in a Series Circuit is ALWAYS equal. Please verify your input !");
                    alert.showAndWait();
                }else{ 
                    labelCurSit3Series.setText(String.format("%.3f",current1)+" A");
                    labelBatSit3Series.setText(String.format("%.3f",totalvoltage)+" V");
                    
                    double req = res1Series3.getResistance()+res2Series3.getResistance()+res3Series3.getResistance();
                    labelReqSit3Series.setText(String.format("%.3f", req)+" Ohm");
                }
            }

        }

       //if 2 empty
        else if ((resistance1Sit3Series.getText().isEmpty() && voltage1Sit3Series.getText().isEmpty()) ||
               (resistance1Sit3Series.getText().isEmpty() && voltage2Sit3Series.getText().isEmpty()) ||
               (resistance1Sit3Series.getText().isEmpty() && voltage3Sit3Series.getText().isEmpty()) ||
               (voltage1Sit3Series.getText().isEmpty()&& resistance2Sit3Series.getText().isEmpty()) ||
               (voltage1Sit3Series.getText().isEmpty()&& resistance3Sit3Series.getText().isEmpty()) ||
               (voltage2Sit3Series.getText().isEmpty()&& resistance2Sit3Series.getText().isEmpty()) ||
               (voltage2Sit3Series.getText().isEmpty()&& resistance3Sit3Series.getText().isEmpty()) ||
               (voltage3Sit3Series.getText().isEmpty()&& resistance3Sit3Series.getText().isEmpty()) ||
               (voltage3Sit3Series.getText().isEmpty()&& resistance2Sit3Series.getText().isEmpty()))
               {
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Please enter inputs for 2 categories (battery voltage, resistors voltage, resistances or current)");
                    alert.showAndWait();
       }


    }

    public void handleStepsSit3Series(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label steps = new Label();
        steps.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(steps, 0, 0);

    //RESULT IF HAVE CURRENT AND RESISTANCES
           if ((currentSit3Series.getText().isEmpty()==false)&& (resistance1Sit3Series.getText().isEmpty()==false) && (resistance2Sit3Series.getText().isEmpty()==false) && (resistance3Sit3Series.getText().isEmpty()==false)){
                double voltage1 = (res1Series3.getResistance() * (Double.parseDouble(currentSit3Series.getText())));
                double voltage2 = ((Double.parseDouble(currentSit3Series.getText())) * res2Series3.getResistance());
                double voltage3 = ((Double.parseDouble(currentSit3Series.getText())) * res3Series3.getResistance());
                double totalvoltage = voltage1+voltage2+voltage3;

               steps.setText(" In order to find the resistance of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " I = "+Double.parseDouble(currentSit3Series.getText())+" V\n"
                       + " R1 = "+res1Series3.getResistance()+" A\n"
                       + " R2 = "+res2Series3.getResistance()+" A\n"
                       + " R3 = "+res3Series3.getResistance()+" A\n\n"
                       + " V1 = I*R1 = "+voltage1+" V\n"
                       + " V2 = I*R2 = "+voltage2+" V\n"
                       + " V3 = I*R3 = "+voltage3+" V\n"
                       + " Battery Voltage = V1+ V2+ V3 = "+totalvoltage+" V\n");     
       }



       //RESULT IF HAVE CURRENT AND RESISTOR'S VOLTAGE
       else if ((currentSit3Series.getText().isEmpty()==false)&& (voltage1Sit3Series.getText().isEmpty()==false) && (voltage2Sit3Series.getText().isEmpty()==false) && (voltage3Sit3Series.getText().isEmpty()==false)){
           double totalvoltage = ((res1Series3.getVoltage()) + (res2Series3.getVoltage()) + (res3Series3.getVoltage()));
           double resistance1 = (res1Series3.getVoltage()/(Double.parseDouble(currentSit3Series.getText())));
           double resistance2 = (res2Series3.getVoltage()/(Double.parseDouble(currentSit3Series.getText())));
           double resistance3 = (res3Series3.getVoltage()/(Double.parseDouble(currentSit3Series.getText())));
           steps.setText(" In order to find the resistance of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " I = "+Double.parseDouble(currentSit3Series.getText())+" A\n"
                       + " V1 = "+res1Series3.getVoltage()+" V\n"
                       + " V2 = "+res2Series3.getVoltage()+" V\n"
                       + " V3 = "+res3Series3.getVoltage()+" V\n\n"
                       + " R1 = V1/I = "+resistance1+" Ohm\n"
                       + " R2 = V2/I = "+resistance2+" Ohm\n"
                       + " R3 = V3/I = "+resistance3+" Ohm\n"
                       + " Battery Voltage = V1+ V2+ V3 = "+totalvoltage+" V\n");   
       }


       //RESULT IF HAVE BATTERY VOLTAGE AND RESISTANCES
       else if ((batValueSit3Series.getText().isEmpty()==false)&& (resistance1Sit3Series.getText().isEmpty()==false) && (resistance2Sit3Series.getText().isEmpty()==false) && (resistance3Sit3Series.getText().isEmpty()==false)){
           double req = (res1Series3.getResistance() + res2Series3.getResistance() + res3Series3.getResistance());
           double current = (batSeries3.getVoltage()/req);
           double voltage1 = (res1Series3.getResistance() * current);
           double voltage2 = (current * res2Series3.getResistance());
           double voltage3 = (current * res3Series3.getResistance());

           steps.setText(" In order to find the voltage,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " Step 1: Find the current using the Equivalent Resistance\n\n"
                       + " V = "+batSeries3.getVoltage()+" V\n"
                       + " R1 = "+res1Series3.getResistance()+" Ohm\n"
                       + " R2 = "+res2Series3.getResistance()+" Ohm\n"
                       + " R3 = "+res3Series3.getResistance()+" Ohm\n"
                       + " Req = R1+R2+R3 = "+req+" Ohm\n"
                       + " I = V/Req = "+current+" A\n"
                       + " Step 2: Find the voltage of the resistors using the \n Current found before \n\n"
                       + " V1 = I*R1 = "+voltage1+" V\n"
                       + " V2 = I*R2 = "+voltage2+" V\n"
                       + " V3 = I*R3 = "+voltage3+" V\n");
       }

        //RESULT IF HAVE RESISTOR'S VOLTAGE AND RESISTANCES

       else if ((resistance1Sit3Series.getText().isEmpty()==false) && (resistance2Sit3Series.getText().isEmpty()==false) && (resistance3Sit3Series.getText().isEmpty()==false)
                && (voltage1Sit3Series.getText().isEmpty()==false) && (voltage2Sit3Series.getText().isEmpty()==false) && (voltage3Sit3Series.getText().isEmpty()==false)){

                double current1 = ((res1Series3.getVoltage())/(res1Series3.getResistance()));
                double current2 = ((res2Series3.getVoltage())/(res2Series3.getResistance()));
                double current3 = ((res3Series3.getVoltage())/(res3Series3.getResistance()));
                double totalvoltage = (((res1Series3.getVoltage()) + (res2Series3.getVoltage()) + (res3Series3.getVoltage())));

            if (current1 != current2 || current1!= current3 || current2 != current3){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("Don't forget that the Current in a Series Circuit is ALWAYS equal. Please verify your input !");
                    alert.showAndWait();
            }

            else{

           steps.setText(" In order to find the current of the circuit,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " R1 = "+res1Series3.getResistance()+" Ohm\n"
                       + " R2 = "+res2Series3.getResistance()+" Ohm\n"
                       + " R3 = "+res3Series3.getResistance()+" Ohm\n"
                       + " V1 = "+res1Series3.getVoltage()+" V\n"
                       + " V2 = "+res2Series3.getVoltage()+" V\n"
                       + " V3 = "+res3Series3.getVoltage()+" V\n\n"
                       + " I = V1/R1 = V2/R2 = V3/R3 = "+((res1Series3.getVoltage())/(res1Series3.getResistance()))+" A\n"
                       + " Battery Voltage = V1+ V2+ V3 = "+((res1Series3.getVoltage())+(res2Series3.getVoltage())+(res3Series3.getVoltage()))+" V\n"); 
       }

    }
        Scene scene = new Scene(layout, 520, 500);  
        stage.setTitle("Steps");
        stage.setScene(scene);
        stage.show();
    }
    

    // SITUATION 1 PARALLEL
    
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
           
           labelRes1Sit1Parallel.setText(String.format("%.3f", resistance1)+" Ohm");
           labelRes2Sit1Parallel.setText(String.format("%.3f", resistance2)+" Ohm");
           
           double req = 1/((1/resistance1)+(1/resistance2));
           labelReqSit1Parallel.setText(String.format("%.3f", req)+" Ohm");
       }
       
       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false) && (batValueSit1Parallel.getText().isEmpty()==false)){
           double current1 = (batParallel1.getVoltage() / res1Parallel1.getResistance());
           double current2 = (batParallel1.getVoltage() / res2Parallel1.getResistance());
           
           labelCur1Sit1Parallel.setText(String.format("%.3f", current1)+" A");
           labelCur2Sit1Parallel.setText(String.format("%.3f", current2)+" A");
           
           
           double req = 1/((1/res1Parallel1.getResistance())+(1/res2Parallel1.getResistance()));
           labelReqSit1Parallel.setText(String.format("%.3f", req)+" Ohm");
       }
       
       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit1Parallel.getText().isEmpty()==false)&& (current2Sit1Parallel.getText().isEmpty()==false) && (resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false)){
           double voltage1 = (res1Parallel1.getResistance() * res1Parallel1.getCurrent());
           double voltage2 = (res2Parallel1.getResistance() * res2Parallel1.getCurrent());
           
           double voltageTotal = voltage1 + voltage2;
           labelBatSit1Parallel.setText(String.format("%.3f", voltageTotal)+" V");
           
           double req = 1/((1/res1Parallel1.getResistance())+(1/res2Parallel1.getResistance()));
           labelReqSit1Parallel.setText(String.format("%.3f", req)+" Ohm");           
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
                       + " V = "+String.format("%.3f", batParallel1.getVoltage())+" V\n"
                       + " I1 = "+String.format("%.3f", res1Parallel1.getCurrent())+" A\n"
                       + " I2 = "+String.format("%.3f", res2Parallel1.getCurrent())+" A\n\n"
                       + " R1 = V/I1 = "+String.format("%.3f",(batParallel1.getVoltage() / res1Parallel1.getCurrent()))+" Ohm\n"
                       + " R2 = V/I2 = "+String.format("%.3f",(batParallel1.getVoltage() / res2Parallel1.getCurrent()))+" Ohm\n");     
       }
       
       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false) && (batValueSit1Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the current of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " V = "+String.format("%.3f",batParallel1.getVoltage())+" V\n"
                       + " R1 = "+String.format("%.3f",res1Parallel1.getResistance())+" Ohm\n"
                       + " R2 = "+String.format("%.3f",res2Parallel1.getResistance())+" Ohm\n\n"
                       + " I1 = V/R1 = "+String.format("%.3f",(batParallel1.getVoltage() / res1Parallel1.getResistance()))+" A\n"
                       + " I2 = V/R2 = "+String.format("%.3f",(batParallel1.getVoltage() / res2Parallel1.getResistance()))+" A\n");
           
       }
       
       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit1Parallel.getText().isEmpty()==false)&& (current2Sit1Parallel.getText().isEmpty()==false) && (resistance1Sit1Parallel.getText().isEmpty()==false)&& (resistance2Sit1Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the voltage,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " I1 = "+String.format("%.3f",res1Parallel1.getCurrent())+" A\n"
                       + " I2 = "+String.format("%.3f",res2Parallel1.getCurrent())+" A\n"
                       + " R1 = "+String.format("%.3f",res1Parallel1.getResistance())+" Ohm\n"
                       + " R2 = "+String.format("%.3f",res2Parallel1.getResistance())+" Ohm\n\n"
                       + " V1 = I1*R1 = "+String.format("%.3f",(res1Parallel1.getResistance() * res1Parallel1.getCurrent()))+" V\n"
                       + " V2 = I2*R2 = "+String.format("%.3f",(res2Parallel1.getResistance() * res2Parallel1.getCurrent()))+" V\n"
                       + " V = V1+V2 = "+String.format("%.3f",((res1Parallel1.getResistance() * res1Parallel1.getCurrent())+(res2Parallel1.getResistance() * res2Parallel1.getCurrent())))+" V\n");
           

       }
        Scene scene = new Scene(layout, 520, 400);  
        stage.setTitle("Steps");
        stage.setScene(scene);
        stage.show();
        
    }
    
    //HANDLE CALCULATE PARALLEL 2

    public void handleCalculateSit2Parallel(){
        
        TextField[] textFieldList = {batValueSit2Parallel, resistance1Sit2Parallel,resistance2Sit2Parallel,resistance3Sit2Parallel, current1Sit2Parallel, current2Sit2Parallel, current3Sit2Parallel};
        int nbEmpty = 0;
        
        for(TextField field: textFieldList){
            if (field.getText().isEmpty()){
                nbEmpty++;
            }
        }
        
        // if all filled
        if (nbEmpty == 7){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter an input for only 2 of the 3 categories (Voltage, Resistance, Current)");
            alert.showAndWait();
        }
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
           labelRes1Sit2Parallel.setText(String.format("%.3f", resistance1)+" Ohm");
           labelRes2Sit2Parallel.setText(String.format("%.3f", resistance2)+" Ohm");
           labelRes3Sit2Parallel.setText(String.format("%.3f", resistance3)+" Ohm");
           
           double req = 1/((1/resistance1)+(1/resistance2)+(1/resistance2));
           labelReqSit2Parallel.setText(String.format("%.3f", req));
       }

       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false) && (resistance3Sit2Parallel.getText().isEmpty()==false)&& (batValueSit2Parallel.getText().isEmpty()==false)){
           double current1 = (batParallel2.getVoltage() / res1Parallel2.getResistance());
           double current2 = (batParallel2.getVoltage() / res2Parallel2.getResistance());
           double current3 = (batParallel2.getVoltage() / res3Parallel2.getResistance());

           labelCur1Sit2Parallel.setText(String.format("%.3f", current1)+" A");
           labelCur2Sit2Parallel.setText(String.format("%.3f", current2)+" A");
           labelCur3Sit2Parallel.setText(String.format("%.3f", current3)+" A");
           
           double req = 1/((1/res1Parallel1.getResistance())+(1/res2Parallel1.getResistance())+(1/res3Parallel2.getResistance()));
           labelReqSit2Parallel.setText(String.format("%.3f", req));
           
       }

       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit2Parallel.getText().isEmpty()==false)&& (current2Sit2Parallel.getText().isEmpty()==false) && (current3Sit2Parallel.getText().isEmpty()==false)
               && (resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false)&& (resistance3Sit2Parallel.getText().isEmpty()==false)){

           double voltage1 = (res1Parallel2.getResistance() * res1Parallel2.getCurrent());
           double voltage2 = (res2Parallel2.getResistance() * res2Parallel2.getCurrent());
           double voltage3 = (res3Parallel2.getResistance() * res3Parallel2.getCurrent());

           double voltageTotal = voltage1 + voltage2 + voltage3;
           labelBatSit2Parallel.setText(String.format("%.3f", voltageTotal)+" V");
           
           double req = 1/((1/res1Parallel1.getResistance())+(1/res2Parallel1.getResistance())+(1/res3Parallel2.getResistance()));
           labelReqSit2Parallel.setText(String.format("%.3f", req));
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
                       + " V = "+String.format("%.3f",batParallel2.getVoltage())+" V\n"
                       + " I1 = "+String.format("%.3f",res1Parallel2.getCurrent())+" A\n"
                       + " I2 = "+String.format("%.3f",res2Parallel2.getCurrent())+" A\n"
                       + " I3 = "+String.format("%.3f",res3Parallel2.getCurrent())+" A\n\n"
                       + " R1 = V/I1 = "+String.format("%.3f",(batParallel2.getVoltage() / res1Parallel2.getCurrent()))+" Ohm\n"
                       + " R2 = V/I2 = "+String.format("%.3f",(batParallel2.getVoltage() / res2Parallel2.getCurrent()))+" Ohm\n"
                       + " R3 = V/I3 = "+String.format("%.3f",(batParallel2.getVoltage() / res3Parallel2.getCurrent()))+" Ohm\n");     
       }

       //RESULT IF HAVE VOLTAGE AND RESISTANCE
       else if ((resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false) && (resistance3Sit2Parallel.getText().isEmpty()==false)&& (batValueSit2Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the current of each resistor,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " V = "+String.format("%.3f",batParallel2.getVoltage())+" V\n"
                       + " R1 = "+String.format("%.3f",res1Parallel2.getResistance())+" Ohm\n"
                       + " R2 = "+String.format("%.3f",res2Parallel2.getResistance())+" Ohm\n"
                       + " R3 = "+String.format("%.3f",res3Parallel2.getResistance())+" Ohm\n\n"
                       + " I1 = V/R1 = "+String.format("%.3f",(batParallel2.getVoltage() / res1Parallel2.getResistance()))+" A\n"
                       + " I2 = V/R2 = "+String.format("%.3f",(batParallel2.getVoltage() / res2Parallel2.getResistance()))+" A\n"
                       + " I3 = V/R3 = "+String.format("%.3f",(batParallel2.getVoltage() / res3Parallel2.getResistance()))+" A\n");

       }

       //RESULT IF HAVE RESISTANCE AND CURRENT
       else if ((current1Sit2Parallel.getText().isEmpty()==false)&& (current2Sit2Parallel.getText().isEmpty()==false) && (current3Sit2Parallel.getText().isEmpty()==false)
               && (resistance1Sit2Parallel.getText().isEmpty()==false)&& (resistance2Sit2Parallel.getText().isEmpty()==false)&& (resistance3Sit2Parallel.getText().isEmpty()==false)){
           steps.setText(" In order to find the voltage,\n"
                       + " you have to use Ohm's Law (V = I*R)\n\n"
                       + " I1 = "+String.format("%.3f",res1Parallel2.getCurrent())+" A\n"
                       + " I2 = "+String.format("%.3f",res2Parallel2.getCurrent())+" A\n"
                       + " I3 = "+String.format("%.3f",res3Parallel2.getCurrent())+" A\n"
                       + " R1 = "+String.format("%.3f",res1Parallel2.getResistance())+" Ohm\n"
                       + " R2 = "+String.format("%.3f",res2Parallel2.getResistance())+" Ohm\n"
                       + " R3 = "+String.format("%.3f",res3Parallel2.getResistance())+" Ohm\n\n"
                       + " V1 = I1*R1 = "+String.format("%.3f",(res1Parallel2.getResistance()) * res1Parallel2.getCurrent())+" V\n"
                       + " V2 = I2*R2 = "+String.format("%.3f",(res2Parallel2.getResistance()) * res2Parallel2.getCurrent())+" V\n"
                       + " V3 = I3*R3 = "+String.format("%.3f",(res3Parallel2.getResistance()) * res3Parallel2.getCurrent())+" V\n"
                       + " V = V1+V2+V3 = "+String.format("%.3f",((res1Parallel2.getResistance() * res1Parallel2.getCurrent())+(res2Parallel2.getResistance() * res2Parallel2.getCurrent()+ (res3Parallel2.getResistance() * res3Parallel2.getCurrent()))))+" V\n");


       }


        Scene scene = new Scene(layout, 520, 400);  
        stage.setTitle("Steps");
        stage.setScene(scene);
        stage.show();

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
           
    }


}


