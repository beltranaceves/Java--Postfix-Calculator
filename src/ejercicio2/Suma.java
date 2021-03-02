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
public class Suma extends OperacionBinaria {

    public Suma(Expresion izquierda, Expresion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public double operar() {
        return HijoIzquierda.operar() + HijoDerecha.operar();
    }

    @Override
    public String representacion() {
        return "+";
    }

    
}