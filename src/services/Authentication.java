/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import projectmanager.models.Employee;

/**
 *
 * @author Weverson B de Lima
 */
public class Authentication {
    Employee employee;
    boolean authentication = false;

    public Authentication(Employee employee) {
        this.employee = employee;
    }
    
    public void AuthenticationEmployee(){
        
        // logica de autênticação
    }

    public boolean isAuthentication() {
        return authentication;
    }
 
}
