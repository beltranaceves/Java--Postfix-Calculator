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
public abstract class OperacionUnaria implements Expresion{
    Expresion Hoja;
    
    OperacionUnaria(Expresion hoja) {
       this.Hoja = hoja;
    }
    
    public Expresion HijoIzquierda() {
        return this.Hoja;
    }
    
    public Expresion HijoDerecha() {
        return this.Hoja;
    }
    
    public abstract double operar();
    
    public abstract String representacion();
    
}
