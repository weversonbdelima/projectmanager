/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import exception.ValidationForm;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Border;
import javafx.stage.Stage;
import models.Employee;
import models.EmployeeDAOImplements;
import models.Location;
import models.LocationDAOImplements;
import models.Task;
import models.TaskDAOImplements;
import services.Database;
import views.ProjectManager;

/**
 *
 * @author Weverson B de Lima
 */
public class FXMLManagerPanelController implements Initializable {
    
    @FXML
    private HBox hBoxList;

    @FXML
    private void handleButtonRegisterTaskAction(ActionEvent event) {
        ProjectManager.changeScreen("registerTask");
    }
    @FXML
    private void handleButtonLocationTaskAction(ActionEvent event) {
        ProjectManager.changeScreen("locationTask");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Database db = new Database();
          //Validação de dados
          try(Connection connection = DriverManager.getConnection(db.URL, db.USER, db.PASSWORD)){
                 LocationDAOImplements locationDAO = new LocationDAOImplements(connection);
                 LinkedList<Location> listLocation = locationDAO.searchList();
                 for(Location l: listLocation){   
                     VBox vBoxFazer = new VBox();                  
                     VBox vBoxEmProgresso = new VBox();
                     VBox vBoxConcluido = new VBox();

                     if(l.getEstado().compareTo("Fazer") == 0){
                         vBoxFazer.getChildren().addAll(new Label("Nome:"),
                                                        new Label(l.getEmploye().getNome()),
                                                        new Label("Título:"),
                                                        new Label(l.getTask().getTitulo())
                                                        );
                     }
                     if(l.getEstado().compareTo("Em progresso") == 0){
                         vBoxEmProgresso.getChildren().addAll(new Label("Nome:"),
                                                        new Label(l.getEmploye().getNome()),
                                                        new Label("Título:"),
                                                        new Label(l.getTask().getTitulo())
                                                        );
                     }
                     if(l.getEstado().compareTo("Concluido") == 0){
                         vBoxConcluido.getChildren().addAll(new Label("Nome:"),
                                                        new Label(l.getEmploye().getNome()),
                                                        new Label("Título:"),
                                                        new Label(l.getTask().getTitulo())
                                                        );
                     }
                     hBoxList.getChildren().addAll(vBoxFazer,
                                                   vBoxEmProgresso,
                                                   vBoxConcluido
                                                    );
                 }
                 
          }catch(SQLException sqlException){
                  System.out.println(sqlException);
                  Alert alert = new Alert(Alert.AlertType.ERROR, "Tarefa existente");
                  alert.showAndWait();
          }       
    }    
    
}
