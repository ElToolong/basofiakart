package model.colisionable;

public interface Colisionable {

    /**
     * A traves de Double Dispatch, permite que dos objetos interactuen.
     * @param c Colisionable que esta colisionando con este objeto.
     */
    void interactuar(Colisionable c);

}
