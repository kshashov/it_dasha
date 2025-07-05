package org.github.dkovaleva.bot;

import org.github.dkovaleva.bot.data.TasksRepository;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

import java.util.List;

/*
    https://github.com/rubenlagus/TelegramBots?tab=readme-ov-file
    https://rubenlagus.github.io/TelegramBotsDocumentation/telegram-bots.html
 */
public class MyBot implements LongPollingSingleThreadUpdateConsumer {
    public static final String BOT_TOKEN = "5251321850:AAFuuXMwQzf9Hav9IxfwuRS49e_icrFkcK0";
    private TelegramClient telegramClient = new OkHttpTelegramClient(BOT_TOKEN);
    private final TasksRepository repository;

    public MyBot() {
        repository = new TasksRepository();
    }

    @Override
    public void consume(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {

            // Create your send message object
            String chatId = update.getMessage().getChatId().toString();
            String text = update.getMessage().getText();
            User user = update.getMessage().getFrom();
            if (user == null) {
                return;
            }

            if (text.startsWith("/list")) {
                showTasks(chatId, user);
            } else if (text.startsWith("/add")) {
                addTask(chatId, user, text);
            } else if (text.startsWith("/delete")) {
                deleteTask(chatId, user, text);
            } else {
                execute(new SendMessage(chatId, "Одна ошибка и ты ошибся. Бывает."));
            }

            // TODO Dasha
        }
    }

    private void deleteTask(String chatId, User user, String text) {
        // делим исходную строку пробелом, чтобы отсечь команду /удалить
        String[] todoArr = text.split(" ", 2);

        int i;
        try {
            i = Integer.parseInt(todoArr[1]);
        } catch (NumberFormatException ex) {
            execute(new SendMessage(chatId, "Некорректный номер задачи"));
            return;
        }

        if (todoArr.length == 1) {
            execute(new SendMessage(chatId, "Номер задачи не указан"));
        } else {
            // удаляем из списка по номеру
            try {
                repository.remove(user.getId(), i - 1);
            } catch (IllegalArgumentException ex) {
                execute(new SendMessage(chatId, "Отсутствует задача с указанным номером"));
                return;
            }

            showTasks(chatId, user);
        }
    }

    private void addTask(String chatId, User user, String text) {
        // делим исходную строку пробелом, чтобы отсечь команду /добавить
        String[] todoArr = text.split(" ", 2);
        // добавляем новую в конец списка
        if (todoArr.length == 1) {
            execute(new SendMessage(chatId, "Текст задачи не указан"));
        } else {
            Task task = new Task(todoArr[1]);
            repository.add(user.getId(), task);
            showTasks(chatId, user);
        }
    }

    private void showTasks(String chatId, User user) {
        List<Task> taskList = repository.getAll(user.getId());
        if (taskList.isEmpty()) {
            // если список пуст
            execute(new SendMessage(chatId, "Нет задач"));
        } else {
            // если есть задачи - формируем одну строку из задач
            String todos = "";
            int i = 1;
            for (Task task : taskList) {
                todos += i + " " + task.getText() + "\n";
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
