/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Beltrán
 */
public class CambioDeSigno extends OperacionUnaria {

    public CambioDeSigno(Expresion hoja) {
        super(hoja);
    }

    @Override
    public double operar() {
        return  -Hoja.operar();
    }

    @Override
    public String representacion() {
        return "+/-";
    }
    
}
