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
public class Constante implements Expresion {
    double valor;
    public Constante(double input) {
        valor = input;
    }
    
    @Override
    public double operar() {
        return valor;
    }

    @Override
    public String representacion() {
        return Double.toString(valor);
    }
    
    public Expresion HijoIzquierda() {
        return null;
    }
    
    public Expresion HijoDerecha() {
        return null;
    }
}
