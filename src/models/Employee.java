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
public class Employee {
    private int registroEmpregado;
    String nome;
    String sobreNome;
    String sexo;

    public Employee(int registroEmpregado, String nome, String sobreNome, String sexo) {
        this.registroEmpregado = registroEmpregado;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Employee{" + "registroEmpregado=" + registroEmpregado + ", nome=" + nome + ", sobreNome=" + sobreNome + ", sexo=" + sexo + '}';
    }
        
    public int getRegistroEmpregado() {
        return registroEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setRegistroEmpregado(int registroEmpregado) {
        this.registroEmpregado = registroEmpregado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
