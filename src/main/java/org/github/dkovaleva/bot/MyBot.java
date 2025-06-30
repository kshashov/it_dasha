package org.github.dkovaleva.bot;

import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

import java.util.ArrayList;
import java.util.List;

/*
    https://github.com/rubenlagus/TelegramBots?tab=readme-ov-file
    https://rubenlagus.github.io/TelegramBotsDocumentation/telegram-bots.html
 */
public class MyBot implements LongPollingSingleThreadUpdateConsumer {
    public static final String BOT_TOKEN = "5251321850:AAFuuXMwQzf9Hav9IxfwuRS49e_icrFkcK0";
    private TelegramClient telegramClient = new OkHttpTelegramClient(BOT_TOKEN);
    private List<TODO> todoList = new ArrayList<>();


    @Override
    public void consume(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {

            // Create your send message object
            String chatId = update.getMessage().getChatId().toString();
            String text = update.getMessage().getText();

            if (text.startsWith("/список")) {
                if (todoList.isEmpty()) {
                    // если список пуст
                    execute(new SendMessage(chatId, "Пусто"));
                } else {
                    // если есть задачи - формируем одну строку из задач
                    String todos = "";
                    int i = 1;
                    for (TODO todo : todoList) {
                        todos += i + todo.getText() + "\n";
                        i++;
                    }

                    // вариант с обычным фором со счетчиком
//                    for (int i = 0; i < todoList.size(); i++) {
//                        todos += (i + 1) + todoList.get(i).getText() + "\n";
//                    }

                    SendMessage sendMessage = new SendMessage(chatId, todos);
                    execute(sendMessage);
                }
            } else if (text.startsWith("/добавить")) {
                // делим исходную строку пробелом чтобы отсечь команду /добавить
                String[] todoArr = text.split(" ", 2);
                // добавляем новую в конец списка
                TODO todo = new TODO(todoArr[1]);
                todoList.add(todo);
            } else if (text.startsWith("/удалить")) {
                // делим исходную строку пробелом чтобы отсечь команду /удалить
                String[] todoArr = text.split(" ", 2);
                int i = Integer.parseInt(todoArr[1]);
                // удаляем из списка по номеру
                todoList.remove(i - 1);

            }

            // TODO Dasha
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
