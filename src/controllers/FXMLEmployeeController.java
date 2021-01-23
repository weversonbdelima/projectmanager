/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import exception.CampoVazio;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;

/**
 *
 * @author Weverson B de Lima
 */
public class FXMLEmployeeController implements Initializable {
    
    @FXML
    private TextField textFieldNome;
    @FXML
    private TextField textFieldSobreNome;
    @FXML
    private TextField textFieldSenha;
    @FXML
    private TextField textFieldConfirmarSenha;    
    @FXML
    private RadioButton radioButtonSexoMasculino;
    @FXML
    private RadioButton radioButtonSexoFeminino;
    @FXML
    private TextField textFieldLogradouro;
    @FXML
    private TextField textFieldComplemento;
    @FXML
    private TextField textFieldBairro;
    @FXML
    private TextField textFieldCidade;
    @FXML
    private TextField textFieldCep;
    
    
    @FXML
    private void handleButtonRegisterEmployeeAction(ActionEvent event) {
        System.out.println("You clicked me!");
        
        //Validação de dados
        try{
            //Validação de dados pessoais
            if(textFieldNome.getText().compareTo("") == 0)
                throw new CampoVazio("nome");
            if(textFieldSobreNome.getText().compareTo("") == 0)
                throw new CampoVazio("sobrenome");
            if(textFieldSenha.getText().compareTo("") == 0)
                throw new CampoVazio("senha");
            if(textFieldConfirmarSenha.getText().compareTo("") == 0)
                throw new CampoVazio("confirmar senha");
            
            if(radioButtonSexoMasculino.isSelected() == false && radioButtonSexoFeminino.isSelected() == false)
                throw new CampoVazio("sexo");
            
            //Validação de endereço
            if(textFieldLogradouro.getText().compareTo("") == 0)
                throw new CampoVazio("logradouro");
            if(textFieldComplemento.getText().compareTo("") == 0)
                throw new CampoVazio("complemento");
            if(textFieldBairro.getText().compareTo("") == 0)
                throw new CampoVazio("bairro");
            if(textFieldCidade.getText().compareTo("") == 0)
                throw new CampoVazio("cidade");
            if(textFieldCep.getText().compareTo("") == 0)
                throw new CampoVazio("cep");
            
            //Após realizar todas as verificação de preenchimento de campo
            //Insere os dados no banco de dados;
        }catch(CampoVazio campoVazio){
            System.out.println(campoVazio);
        }
        
            
//        System.out.println(radioButtonSexMale.isSelected());
//              System.out.println(radioButtonSexFemale.isSelected());
        
//        Employee employee = new Employee(
//                                            textFieldName.getText(),
//                                            textFieldLastName.getText()
//                                        )
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
