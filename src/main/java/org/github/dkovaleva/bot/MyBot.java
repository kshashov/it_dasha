package org.github.dkovaleva.bot;

import org.github.dkovaleva.HttpClientTest;
import org.github.dkovaleva.bot.data.ListRepository;
import org.github.dkovaleva.bot.data.Task;
import org.github.dkovaleva.bot.data.TaskList;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow;
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
    private final ListRepository listRepository;

    public MyBot() {
        listRepository = new ListRepository();
    }

    @Override
    public void consume(Update update) {

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

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
//            } else {
//                execute(new SendMessage(chatId, "Одна ошибка и ты ошибся. Бывает."));
//
            } else if (text.startsWith("/aList")) {
                addTaskList(chatId, user, text);
            } else if (text.startsWith("/sList")) {
                showLists(chatId, user);
            } else if (text.startsWith("/delList")) {
                deleteList(chatId, user, text);
            } else if (text.startsWith("/reList")) {
                renameList(chatId, user, text);
            } else if (text.startsWith("/selList")) {
                selectList(chatId, user, text);
            } else if (text.startsWith("/button")) {
                SendMessage sendMessage = new SendMessage(chatId, "button");
                InlineKeyboardButton huiButton = InlineKeyboardButton.builder()
                        .text("hui")
                        .callbackData("h")
                        .build();
                sendMessage.setReplyMarkup(new InlineKeyboardMarkup(List.of(new InlineKeyboardRow(huiButton))));
                execute(sendMessage);
            } else if (text.startsWith("/waifu")) {
                String[] listArr = text.split(" ", 3);

                HttpClientTest.Waifu waifu = HttpClientTest.getWaifu(listArr[1], listArr[2]);

                SendPhoto sendPhoto = SendPhoto.builder()
                        .chatId(chatId)
                        .caption(waifu.name.first + " " + waifu.name.last)
                        .photo(new InputFile(waifu.image.large))
                        .build();
                try {
                    telegramClient.execute(sendPhoto);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // TODO Dasha
        } else if (update.hasCallbackQuery()) {
            if (update.getCallbackQuery().getData().equals("h")) {
                execute(new SendMessage(update.getCallbackQuery().getMessage().getChatId().toString(), "hui"));
            }
        }
    }

    private void selectList(String chatId, User user, String text) {
        String[] listArr = text.split(" ", 2);

        if (listArr.length == 1) {
            execute(new SendMessage(chatId, "Номер списка не указан"));
        } else {
            int listIndex;
            try {
                listIndex = Integer.parseInt(listArr[1]) - 1;
            } catch (NumberFormatException exception) {
                execute(new SendMessage(chatId, "Неверно указан номер списка"));
                return;
            }

            listRepository.selectList(user.getId(), listIndex);
        }
    }

    private void addTaskList(String chatId, User user, String text) {
        // делим исходную строку пробелом, чтобы отсечь команду /добавить
        String[] listArr = text.split(" ", 2);

        if (listArr.length == 1) {
            execute(new SendMessage(chatId, "Наименование списка не указано"));
        } else {
            TaskList newTaskList = new TaskList();
            newTaskList.setUserId(user.getId());
            newTaskList.setTitle(listArr[1]);
            newTaskList.setActive(false);
            listRepository.addListTask(newTaskList);
        }
        showLists(chatId, user);
    }

    private void renameList(String chatId, User user, String text) {
        // делим исходную строку пробелом, чтобы отсечь команду /добавить
        String[] listArr = text.split(" ", 3);

//        if (listArr.length == 1) {
//            execute(new SendMessage(chatId, "Наименование и номер списка не указаны"));
//        } else if (listArr.length == 2) {
//            execute(new SendMessage(chatId, "Наименование списка не указано"));
//        } else {
//            int numTask = Integer.parseInt(listArr[1]) - 1;
////            List<TaskList> taskLists = listReponsitory.getLists(user.getId());
////            taskLists.get(numTask - 1).setTitle(listArr[2]);
//        }

        int numTask;
        try {
            numTask = Integer.parseInt(listArr[1]) - 1;
        } catch (NumberFormatException exception) {
            execute(new SendMessage(chatId, "Неверно указан номер списка"));
            return;
        }

        if (listArr.length == 1) {
            execute(new SendMessage(chatId, "Наименование и номер списка не указаны"));
        } else {
            try {
                listRepository.rename(user.getId(), numTask, listArr[2]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                execute(new SendMessage(chatId, "Неверно указан номер списка"));
            }
        }
        showLists(chatId, user);
    }

    private void deleteList(String chatId, User user, String text) {
        String[] listArr = text.split(" ", 2);

        int num;
        try {
            num = Integer.parseInt(listArr[1]);
        } catch (NumberFormatException ex) {
            execute(new SendMessage(chatId, "Номер листа не распознан"));
            return;
        }

        if (listArr.length == 1) {
            execute(new SendMessage(chatId, "Номер списка не указан"));
        } else {
            try {
                listRepository.deleteList(user.getId(), num - 1);
            } catch (IllegalArgumentException ex) {
                execute(new SendMessage(chatId, "Неверное значение"));
            }
        }
        showLists(chatId, user);
    }

    private void showLists(String chatId, User user) {
        List<TaskList> taskLists = listRepository.getLists(user.getId());
        if (taskLists.isEmpty()) {
            // если списков нет
            execute(new SendMessage(chatId, "Отсутствуют списки задач"));
        } else {
            // если есть списки - формируем строку из наименований списков
            String allList = "";
            int i = 1;
            for (TaskList listi : taskLists) {
                allList += i + " " + listi.getTitle();
                allList += listi.isActive() == true ? " - is Active" : "";
                allList += "\n";
                i++;
            }

            SendMessage sendMessage = new SendMessage(chatId, allList);
            execute(sendMessage);
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
                listRepository.remove(user.getId(), i);
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
            Task task = new Task();
            task.setText(todoArr[1]);
            listRepository.addTask(user.getId(), task.getText());
            showTasks(chatId, user);
        }
    }

    private void showTasks(String chatId, User user) {
        List<Task> taskList = listRepository.getTasksForActiveList(user.getId());
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
