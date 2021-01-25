/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Weverson B de Lima
 */
public class Database {
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/database";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    
    public Database() {
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
            createTableEmployee(connection);
            createTableTask(connection);
            createTableLocation(connection);
        }catch(SQLException sqlException){
            System.out.println(sqlException);
        }     
    }
    
     public void createTableEmployee(Connection connection) throws SQLException{
        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE `database`.`Employee` (\n" +
                    "  `id` INT NOT NULL,\n" +
                    "  `nome` VARCHAR(45) NOT NULL,\n" +
                    "  `sobreNome` VARCHAR(45) NOT NULL,\n" +
                    "  `senha` VARCHAR(45) NOT NULL,\n" +
                    "  PRIMARY KEY (`id`));";
        
        statement.execute(sql);    
     }
     public void createTableTask(Connection connection) throws SQLException{
        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE `database`.`task` (\n" +
                    "  `id` INT NOT NULL,\n" +
                    "  `titulo` VARCHAR(45) NULL,\n" +
                    "  `descricao` VARCHAR(45) NULL,\n" +
                    "  PRIMARY KEY (`id`));";
        statement.execute(sql);    
     }
     public void createTableLocation(Connection connection) throws SQLException{
        System.out.println("tst");
        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE `database`.`location` (\n" +
                    "  `id` INT NOT NULL,\n" +
                    "  `estado` VARCHAR(45) NULL,\n" +
                    "  `idEmployee` INT NULL,\n" +
                    "  `idTask` INT NULL,\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  INDEX `idTask_idx` (`idTask` ASC) VISIBLE,\n" +
                    "  INDEX `idEmployee_idx` (`idEmployee` ASC) VISIBLE,\n" +
                    "  CONSTRAINT `idEmployee`\n" +
                    "    FOREIGN KEY (`idEmployee`)\n" +
                    "    REFERENCES `database`.`employee` (`id`)\n" +
                    "    ON DELETE NO ACTION\n" +
                    "    ON UPDATE NO ACTION,\n" +
                    "  CONSTRAINT `idTask`\n" +
                    "    FOREIGN KEY (`idTask`)\n" +
                    "    REFERENCES `database`.`task` (`id`)\n" +
                    "    ON DELETE NO ACTION\n" +
                    "    ON UPDATE NO ACTION);";
        statement.execute(sql);         
     }
    
}
