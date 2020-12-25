/**
 * 
 */
package com.project.Health_Bot.dao;

import com.project.Health_Bot.model.Utente;

/**
 * Interfaccia che modella l'utente già registrato
 * 
 * @author FedePalaz & GiovanniNovelli9 & Baldellaux
 *
 */
public interface UtenteRegDao {

    /**
     * Restituisce "True" se l'utente specificato è già registrato nel sistema
     * Restituisce "False" se l'utente non è registrato nel sistema o lo è parzialmente
     * 
     * @param id
     */
    public boolean isRegistered(String id);

    /**
     * Inserisce un nuovo utente non appena viene registrato nel sistema
     * 
     * @param id
     * @param user
     */
    public Utente inserisciUtente(String id, Utente user);

    /**
     * 
     * @param id
     * @param peso
     * @param lbm
     * @param bmi
     */
    public void inserisciMisurazione(String id, float peso, float lbm, float bmi);
}
