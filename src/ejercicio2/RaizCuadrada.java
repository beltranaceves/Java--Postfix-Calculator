/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.lang.Math;
/**
 *
 * @author Beltrán
 */
public class RaizCuadrada extends OperacionUnaria{
    
    public RaizCuadrada(Expresion hoja) {
        super(hoja);
    }

    @Override
    public double operar() {
        return  Math.sqrt(Hoja.operar());
    }

    @Override
    public String representacion() {
        return "SQRT";
    }
}
