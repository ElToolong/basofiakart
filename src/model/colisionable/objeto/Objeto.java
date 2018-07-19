package model.colisionable.objeto;

import javafx.geometry.Point2D;
import model.colisionable.Colisionable;

/**
 * Modela un objeto presente en la pista
 */
public interface Objeto extends Colisionable{

    /**
     * Entrega las coordenadas del onjeto en la pista
     * @return coordenadas
     */
    Point2D getCoordenadas();

    /**
     * Elimina este objeto de la pista en la que se encuentra.
     */
    void eliminar();
}
