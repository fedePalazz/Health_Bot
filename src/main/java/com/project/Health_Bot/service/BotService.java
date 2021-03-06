/**
 * 
 */
package com.project.Health_Bot.service;

import java.util.List;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.project.Health_Bot.exception.InvalidUpdateException;

/**
 * @author FedePalaz & GiovanniNovelli9 & Baldellaux
 * 
 *         Interfaccia contenente i metodi che gestiscono la logica di business
 *         dell'applicazione.
 * 
 */
public interface BotService {

	/**
	 * Ricostruisce lo stato dell'applicazione
	 * 
	 * @param update
	 * @throws InvalidUpdateException
	 * @return risposte dal Bot all'utente
	 */
	public List<SendMessage> gestisciUpdate(Update update) throws InvalidUpdateException;

	/**
	 * Gestisce la fase di registrazione di un nuovo utente
	 * 
	 * @param mess
	 * @param userId
	 * @param chatId
	 * @return prossima vista da mostrare all'utente in fase di registrazione
	 */
	public List<SendMessage> gestisciReg(String mess, String userId, long chatId);

	/**
	 * Gestisce la navigazione attraverso il menù principale del bot
	 * 
	 * @param mess
	 * @param userId
	 * @param username
	 * @param chatId
	 * @return menù principale del bot o sottomenù richiesto dall'utente
	 */
	public List<SendMessage> gestisciMenu(String mess, String userId, String username, long chatId);

}
