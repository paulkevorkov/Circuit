/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circuit;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author paulk
 */
public class Main extends Application{

    
    
    @Override
    public void start(Stage stage) throws Exception {
        String path = "C:/Users/paulk/OneDrive/Documents/NetBeansProjects/Circuit/Resources/Circuit/";
        
        try{            
            URL url = new URL("file:///"+path+"Circuit_Builder_Menu.fxml");
            Parent root = FXMLLoader.load(url);
            Scene menuScene = new Scene(root);
            stage.setScene(menuScene);
            stage.show();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
