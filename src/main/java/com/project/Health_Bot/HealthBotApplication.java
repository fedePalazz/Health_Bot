/**
 * 
 */
package com.project.Health_Bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import com.project.Health_Bot.controller.BotController;

/**
 * Runner
 * 
 * @author FedePalaz & GiovanniNovelli9 & Baldellaux
 *
 */
@SpringBootApplication
public class HealthBotApplication {

	/**
	 * Main
	 * 
	 * @param args
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HealthBotApplication.class, args);

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BotController("health_fit_bot"));
        }
        catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
