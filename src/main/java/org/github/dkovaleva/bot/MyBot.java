package org.github.dkovaleva.bot;

import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

public class MyBot implements LongPollingSingleThreadUpdateConsumer {
    public static final String BOT_TOKEN = "5251321850:AAFuuXMwQzf9Hav9IxfwuRS49e_icrFkcK0";
    private TelegramClient telegramClient = new OkHttpTelegramClient(BOT_TOKEN);

    @Override
    public void consume(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Create your send message object
            String chatId = update.getMessage().getChatId().toString();
            String text = update.getMessage().getText();

            SendMessage sendMessage = new SendMessage(chatId, text + " hui");
            execute(sendMessage);
        }
    }

    private void execute(BotApiMethod<?> command) {
        try {
            // Execute it
            telegramClient.execute(command);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
