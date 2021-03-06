/**
 * 
 */
package com.project.Health_Bot.filter;

import java.util.Iterator;
import java.util.Vector;
import com.project.Health_Bot.exception.FilterArgumentException;
import com.project.Health_Bot.model.Misurazione;

/**
 * 
 * @author FedePalaz & GiovanniNovelli9 & Baldellaux
 * 
 *         Modella il filtro sull'lbm, estendendo la superclasse FiltriMis. Usa due valori di
 *         filtraggio, uno minimo, il pesoMin, ed un valore massimo, il pesoMax.
 *
 */
public class FiltroPeso extends FiltriMis {

    /**
     * Valori minimo e massimo di filtraggio
     */
    private Float pesoMin, pesoMax;

    /**
     * Costruttore
     * 
     * @param pesoMin
     * @param pesoMax
     */
    public FiltroPeso(Float pesoMin, Float pesoMax) {
        super();
        this.pesoMin = pesoMin;
        this.pesoMax = pesoMax;
    }

    @Override
    public void filtra(Vector<Misurazione> misure) {
        if (pesoMin != null) {
            Iterator<Misurazione> iter = misure.iterator();
            while (iter.hasNext()) {
                Misurazione mis = iter.next(); // Prossima misurazione
                if (mis.getPeso() < pesoMin)
                    iter.remove();
            }
        }
        if (pesoMax != null) {
            Iterator<Misurazione> iter = misure.iterator();
            while (iter.hasNext()) {
                Misurazione mis = iter.next(); // Prossima misurazione
                if (mis.getPeso() > pesoMax)
                    iter.remove();
            }
        }
    }

    @Override
    public void validate() {
        if (pesoMin != null && pesoMin < 0)
            throw new FilterArgumentException("Il peso minimo non può essere negativo");
        if (pesoMin != null && pesoMax != null && pesoMax < pesoMin)
            throw new FilterArgumentException("Il peso massimo non può essere minore di quello minimo");
    }

}
