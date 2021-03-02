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
public class Multiplicacion extends OperacionBinaria{
    
    public Multiplicacion(Expresion izquierda, Expresion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public double operar() {
        return HijoIzquierda.operar() * HijoDerecha.operar();
    }

    @Override
    public String representacion() {
        return "*";
    }
}
