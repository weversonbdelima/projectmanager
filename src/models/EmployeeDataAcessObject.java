/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Weverson B de Lima
 */
public interface EmployeeDataAcessObject {
    void insert(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
    Employee search(int id);
}