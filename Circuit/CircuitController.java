
package Circuit;

import java.io.IOException;
import java.net.URL;
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


public class CircuitController {
    String path =  "C:/Users/paulk/OneDrive/Documents/NetBeansProjects/Circuit/Resources/Circuit/";;
    
    @FXML Button GoMenu, GoSeries1, SetBatSit1Series, SetResSit1Series;
    @FXML TextField batValueSit1Series, resistanceSit1Series;
    //CHANGE SCENES
    
    public void switchToSeries1() throws IOException {
        URL url = new URL("file:///"+path+"Series2.fxml");
        Parent root = FXMLLoader.load(url);

        Stage window = (Stage) GoSeries1.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void switchToMenu() throws IOException {
        URL url = new URL("file:///"+path+"Circuit_Builder_Menu.fxml");
        Parent root = FXMLLoader.load(url);

        Stage window = (Stage) GoMenu.getScene().getWindow();
        window.setScene(new Scene(root));
    }
 
    Battery batSeries1 = new Battery();
    Resistor resSeries1 = new Resistor();
        
        
        
        
    Alert alert = new Alert(Alert.AlertType.NONE);
    
    //HANDLE OUTPUTS
    
    public void setBatValueSit1Series() {
        try{
            double voltage = Double.parseDouble(batValueSit1Series.getText());
            batSeries1.setVoltage(voltage);

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
    
    
    
    
    public void onClickSeries(){
        Stage stage = new Stage();
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
        stage.setTitle("What are resistors in series");
        stage.setScene(scene);
        stage.show();
    }
}
