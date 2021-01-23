/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import exception.CampoVazio;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.stage.Stage;
import projectmanager.ProjectManager;

/**
 *
 * @author Weverson B de Lima
 */
public class FXMLAuthenticationController implements Initializable {

    
    @FXML
    private TextField textFieldNome;
    @FXML
    private TextField textFieldSenha;

    
    
    @FXML
    private void handleButtonAuthenticationAction(ActionEvent event) {
        System.out.println("You clicked me!");
        
        if(true){
            ProjectManager.changeScreen("managerPanel");
        }else{
            /* Se a autenticação não for realizada,
            informe o erro ao usuáro, e não redireciona para a tela
            de painel de gerenciamento.
            */
        }
        
    }
    @FXML
    private void handleButtonRegisterEmployeeAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me register!");
        ProjectManager.changeScreen("registerEmployee");

        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
