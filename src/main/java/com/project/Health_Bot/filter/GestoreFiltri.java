/**
 * 
 */
package com.project.Health_Bot.filter;

import java.util.Vector;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.Health_Bot.model.Misurazione;
import com.project.Health_Bot.model.Utente;

/**
 * 
 * @author FedePalaz & GiovanniNovelli9 & Baldellaux
 * 
 *         Classe che gestisce i filtri.
 *
 */
public class GestoreFiltri {

    /**
     * Attributo gestito
     */
    private Vector<FiltriUser> filtriUser;

    /**
     * Attributo gestito
     */
    private Vector<FiltriMis> filtriMis;

    /**
     * Costruttore
     * 
     * @param etaMin
     * @param etaMax
     * @param genere
     * @param tipo
     * @param pesoMin
     * @param pesoMax
     * @param bmiMin
     * @param bmiMax
     * @param lbmMin
     * @param lbmMax
     * @param dataInizio
     * @param dataFine
     */
    public GestoreFiltri(@JsonProperty("etaMin") Integer etaMin, @JsonProperty("etaMax") Integer etaMax,
            @JsonProperty("gen") String genere, @JsonProperty("tipo") String tipo,
            @JsonProperty("pesoMin") Float pesoMin, @JsonProperty("pesoMax") Float pesoMax,
            @JsonProperty("bmiMin") Float bmiMin, @JsonProperty("bmiMax") Float bmiMax,
            @JsonProperty("lbmMin") Float lbmMin, @JsonProperty("lbmMax") Float lbmMax,
            @JsonProperty("dal") String dataInizio, @JsonProperty("al") String dataFine) {

        filtriUser = new Vector<FiltriUser>();
        filtriMis = new Vector<FiltriMis>();

        // Crea un filtro sull'età
        if (etaMin != null || etaMax != null)
            filtriUser.add(new FiltroEta(etaMin, etaMax));
        // Crea un filtro sul genere
        if (genere != null)
            filtriUser.add(new FiltroGenere(genere.toUpperCase().charAt(0)));
        // Crea un filtro sul tipo
        if (tipo != null)
            filtriUser.add(new FiltroTipo(tipo));
        // Crea un filtro sul peso
        if (pesoMin != null || pesoMax != null)
            filtriMis.add(new FiltroPeso(pesoMin, pesoMax));
        // Crea un filtro sul bmi
        if (bmiMin != null || bmiMax != null)
            filtriMis.add(new FiltroBmi(bmiMin, bmiMax));
        // Crea un filtro sull'lbm
        if (lbmMin != null || lbmMax != null)
            filtriMis.add(new FiltroLbm(lbmMin, lbmMax));
        // Crea un filtro sulla data
        if (dataInizio != null || dataFine != null)
            filtriMis.add(new FiltroData(dataInizio, dataFine));
    }

    /**
     * Restituisce un Vector di oggetti di tipo FiltriUser
     * 
     * @return filtriUser
     */
    public Vector<FiltriUser> getFiltriUser() {
        return filtriUser;
    }

    /**
     * Restituisce un Vector di oggetti di tipo FiltreiMis
     * 
     * @return filtriMis
     */
    public Vector<FiltriMis> getFiltriMis() {
        return filtriMis;
    }

    /**
     * Verifica che i filtri non abbiano dei parametri errati
     */
    public void convalidaFiltri() {
        for (FiltriUser filtro : filtriUser)
            filtro.validate();
        for (FiltriMis filtro : filtriMis)
            filtro.validate();
    }

    /**
     * Applica tutti i filtri utente impostati alla lista di utenti
     * 
     * @param utenti
     */
    public void filtraUser(Vector<Utente> utenti) {
        for (FiltriUser filtro : filtriUser)
            filtro.filtra(utenti);
    }

    /**
     * Applica tutti i filtri misure impostati alla lista di misurazioni
     * 
     * @param misure
     */
    public void filtraMis(Vector<Misurazione> misure) {
        for (FiltriMis filtro : filtriMis)
            filtro.filtra(misure);
    }

}
