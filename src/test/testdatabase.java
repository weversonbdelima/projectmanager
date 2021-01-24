/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import models.Employee;
import models.EmployeeDataAcessObjectImplements;
import models.Task;
import models.TaskDataAcessObjectImplements;
import services.Database;

/**
 *
 * @author Weverson B de Lima
 */
public class testdatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        
          Database db = new Database();
           
          try(Connection connection = DriverManager.getConnection(db.URL, db.USER, db.PASSWORD)){
              TaskDataAcessObjectImplements taskDAO = new TaskDataAcessObjectImplements(connection);
            
              Task tasku = new Task(1,"tituloaa", "descrisao");
              taskDAO.search(7);

          }catch(SQLException sqlException){
              System.out.println(sqlException);
          }
    }
    
}
