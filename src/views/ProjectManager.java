/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Weverson B de Lima
 */
public class ProjectManager extends Application {
    
    private static Stage stage; 
    private static Scene sceneAuthentication;
    private static Scene sceneRegisterEmployee;
    private static Scene sceneManagerPanel;
    private static Scene sceneRegisterTask;
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        //Criação de telas da aplicação
        Parent rootAuthentication = FXMLLoader.load(getClass().getResource("FXMLAuthentication.fxml"));
        sceneAuthentication = new Scene(rootAuthentication);
        
        Parent rootRegisterEmployee = FXMLLoader.load(getClass().getResource("FXMLRegisterEmployee.fxml"));
        sceneRegisterEmployee = new Scene(rootRegisterEmployee);
        
        Parent rootManagerPanel = FXMLLoader.load(getClass().getResource("FXMLManagerPanel.fxml"));
        sceneManagerPanel = new Scene(rootManagerPanel);
        
        Parent rootRegisterTask = FXMLLoader.load(getClass().getResource("FXMLRegisterTask.fxml"));
        sceneRegisterTask = new Scene(rootRegisterTask);
        
        
        stage.setScene(sceneAuthentication);
        stage.show();
    }
    
    public static void changeScreen(String screen){
        switch(screen){
            case "registerEmployee":
                stage.setScene(sceneRegisterEmployee);
            break;
            case "managerPanel":
                stage.setScene(sceneManagerPanel);
            break;
            case "registerTask":
                stage.setScene(sceneRegisterTask);
            break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
