package model;

import model.colisionable.objeto.Objeto;

import java.util.ArrayList;

/**
 * Modela la pista en que se juega
 */
public interface Pista {

    /**
     * Entrega la lista de objetos que estan en la pista.
     * @return objetos
     */
    ArrayList<Objeto> getObjetos();
}
