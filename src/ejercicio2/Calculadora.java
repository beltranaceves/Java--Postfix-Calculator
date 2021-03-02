/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Stack;

public class Calculadora {
    String representacion;
    Calculadora() {
        representacion = "";
    }
    
    public double evaluar(Expresion expr) {
        if (expr == null) {
            return 0;
        }
        
        return expr.operar();
    }
    
    public String PostOrden(Expresion raiz) { 
        StringBuffer result = new StringBuffer();
        String result2 = "";
        if (raiz == null) {
            return "";
        }
        
        PostOrden(raiz.HijoIzquierda());
        
        PostOrden(raiz.HijoDerecha());
        
        representacion += raiz.representacion() + " ";
        
        return representacion;
    } 
}

