/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author MI PC
 */
public class Pila {
    
    private Nodo cima;

    public Pila() {
        cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void apilar(PRODUCTOS producto) {
        if (estaVacia()) {
            cima = new Nodo(producto, cima);
            cima.setSiguiente(cima);
        } else {
            Nodo nuevoNodo = new Nodo(producto, cima);
            nuevoNodo.setSiguiente(cima.getSiguiente());
            cima.setSiguiente(nuevoNodo);
        }
    }

    public PRODUCTOS desapilar() {
        if (estaVacia()) {
            return null; // Pila vacía, no se puede desapilar
        }

        Nodo nodoDesapilado = cima;
        if (cima.getSiguiente() == cima) {
            cima = null; // Único nodo en la pila
        } else {
            Nodo nodoAnterior = cima;
            while (nodoAnterior.getSiguiente() != cima) {
                nodoAnterior = nodoAnterior.getSiguiente();
            }
            cima = nodoAnterior;
            nodoAnterior.setSiguiente(nodoDesapilado.getSiguiente());
        }

        return nodoDesapilado.getPRODUCTOS();
    }

    public PRODUCTOS obtenerCima() {
        if (estaVacia()) {
            return null; // Pila vacía, no hay cima
        }
        return cima.getSiguiente().getPRODUCTOS(); // Devuelve el producto en la cima
    }
}
