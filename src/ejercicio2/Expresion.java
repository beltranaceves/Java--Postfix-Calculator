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
public interface Expresion {
    public double operar();
    
    public String representacion();
    
    public Expresion HijoIzquierda();
    
    public Expresion HijoDerecha();
    
}
