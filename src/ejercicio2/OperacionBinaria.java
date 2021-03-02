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
public abstract class OperacionBinaria implements Expresion{
    Expresion HijoIzquierda, HijoDerecha;
    
    OperacionBinaria(Expresion izquierda, Expresion derecha) {
       this.HijoIzquierda = izquierda;
       this.HijoDerecha = derecha;
    }
    
    public Expresion HijoIzquierda() {
        return this.HijoIzquierda;
    }
    
    public Expresion HijoDerecha() {
        return this.HijoDerecha;
    }
    public abstract double operar();
    
    public abstract String representacion();
    
}
