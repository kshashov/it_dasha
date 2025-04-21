package org.github.dkovaleva.bot;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication();
            botsApplication.registerBot(MyBot.BOT_TOKEN, new MyBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
