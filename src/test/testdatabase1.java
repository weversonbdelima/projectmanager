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
import models.Location;
import models.LocationDataAcessObjectImplements;
import models.Task;
import models.TaskDataAcessObjectImplements;
import services.Database;

/**
 *
 * @author Weverson B de Lima
 */
public class testdatabase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        
          Database db = new Database();
           
          try(Connection connection = DriverManager.getConnection(db.URL, db.USER, db.PASSWORD)){
               Employee employee = new Employee(1,"Weverson","Barbosa","271296");
               Task task = new Task(1,"requesito","levantamento");
               
               Location location = new Location(1, "aa fazer", employee, task);
               
               LocationDataAcessObjectImplements locationDAO = new LocationDataAcessObjectImplements(connection);
               LinkedList<Location> listLocation = locationDAO.searchList();
               System.out.println(listLocation);
          }catch(SQLException sqlException){
              System.out.println(sqlException);
          }
    }
    
}
