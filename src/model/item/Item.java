package model.item;

import model.Pista;

public interface Item {

    /**
     * Activa el Item, colocandolo en la pista si corresponde.
     * @param pista Pista en la que se juega.
     */
    void activar(Pista pista);
}
