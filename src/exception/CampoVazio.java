/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Weverson B de Lima
 */
public class CampoVazio extends Exception {
    
    String campo;

    public CampoVazio(String campo) {
        this.campo = campo;
    }

    @Override
    public String toString() {
        return "Error: campo " + campo + " vazio";
    }
    


}
