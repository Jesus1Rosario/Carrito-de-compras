/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

import javax.swing.JOptionPane;

/**
 *
 * @author MI PC
 */
public class Nodo {
    
   PRODUCTOS PRODUCTOS;
   Nodo siguiente;


    public Nodo(PRODUCTOS PRODUCTOS, Nodo siguiente) {
        this.PRODUCTOS = PRODUCTOS;
        this.siguiente = siguiente;
    }

    public PRODUCTOS getPRODUCTOS() {
        return PRODUCTOS;
    }

    public void setPRODUCTOS(PRODUCTOS PRODUCTOS) {
        this.PRODUCTOS = PRODUCTOS;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
   
   
}
