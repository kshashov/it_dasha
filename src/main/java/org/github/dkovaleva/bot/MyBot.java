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

            if (text.startsWith("/list")) {
                showTasks(chatId);
            } else if (text.startsWith("/add")) {
                addTask(text, chatId);
            } else if (text.startsWith("/delete")) {
                deleteTask(text, chatId);
            } else {
                execute(new SendMessage(chatId, "Одна ошибка и ты ошибся. Бывает."));
            }

            // TODO Dasha
        }
    }

    private void deleteTask(String text, String chatId) {
        // делим исходную строку пробелом, чтобы отсечь команду /удалить
        String[] todoArr = text.split(" ", 2);

        int i = 0;
        try {
            i = Integer.parseInt(todoArr[1]);
        } catch (NumberFormatException ex) {
            execute(new SendMessage(chatId, "Некорректный номер задачи"));
            return;
        }

        if (todoArr.length == 1) {
            execute(new SendMessage(chatId, "Номер задачи не указан"));
        } else if (i > todoList.size() || i < 1) { //d != Math.floor(d)
            execute(new SendMessage(chatId, "Отсутствует задача с указанным номером"));
        } else {
            // удаляем из списка по номеру
            todoList.remove(i - 1);
            showTasks(chatId);
        }
    }

    private void addTask(String text, String chatId) {
        // делим исходную строку пробелом, чтобы отсечь команду /добавить
        String[] todoArr = text.split(" ", 2);
        // добавляем новую в конец списка
        if (todoArr.length == 1) {
            execute(new SendMessage(chatId, "Текст задачи не указан"));
        } else {
            TODO todo = new TODO(todoArr[1]);
            todoList.add(todo);
            showTasks(chatId);
        }
    }

    private void showTasks(String chatId) {
        if (todoList.isEmpty()) {
            // если список пуст
            execute(new SendMessage(chatId, "Нет задач"));
        } else {
            // если есть задачи - формируем одну строку из задач
            String todos = "";
            int i = 1;
            for (TODO todo : todoList) {
                todos += i + " " + todo.getText() + "\n";
                i++;
            }

            SendMessage sendMessage = new SendMessage(chatId, todos);
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
