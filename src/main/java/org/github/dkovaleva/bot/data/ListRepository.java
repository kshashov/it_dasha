package org.github.dkovaleva.bot.data;

import java.sql.*;
import java.util.*;

public class ListRepository {
    private Map<Long, List<TaskList>> userLists = new HashMap<>();

    public ListRepository() {
    }

    public void addTask(Long userid, String task) {
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://77.221.141.195:5432/postgres", "postgres", "")) {
            try (PreparedStatement stmt = con.prepareStatement("SELECT tl.id from todobot.tasklist tl " +
                    //"left join todobot.task t on t.tasklistid = tl.id " +
                    "where tl.isactive = true and tl.userid = ? ")) {
                stmt.setLong(1, userid);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    String listId = rs.getString("id");
                    try (PreparedStatement stmt2 = con.prepareStatement("INSERT INTO todobot.task (tasklistid, text) " +
                            "VALUES (?, ?)")) {
                        stmt2.setObject(1, UUID.fromString(listId));
                        stmt2.setString(2, task);
                        stmt2.execute();
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addListTask(TaskList taskList) {
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://77.221.141.195:5432/postgres", "postgres", "")) {
            // use con here
            try (PreparedStatement stmt = con.prepareStatement("INSERT INTO todobot.tasklist (userid, name, isactive) VALUES (?, ?, ?)")) {
                stmt.setLong(1, taskList.getUserId());
                stmt.setString(2, taskList.getTitle());
                stmt.setBoolean(3, taskList.isActive());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<TaskList> getLists(Long userid) {
        List<TaskList> lists = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://77.221.141.195:5432/postgres", "postgres", "")) {
            // use con here
            try (PreparedStatement stmt = con.prepareStatement("SELECT userid, id, name, isactive from todobot.tasklist WHERE userid = ? ORDER BY name")) {
                // use stmt here
                stmt.setLong(1, userid);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Long userId = rs.getLong("userid");
                    UUID id = UUID.fromString(rs.getString("id"));
                    String name = rs.getString("name");
                    Boolean isActive = rs.getBoolean("isactive");
                    TaskList list = new TaskList();
                    list.setActive(isActive);
                    list.setId(id);
                    list.setTitle(name);
                    list.setUserId(userId);
                    lists.add(list);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lists;
    }

    public void deleteList(Long userId, int num) throws IllegalArgumentException {
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://77.221.141.195:5432/postgres", "postgres", "")) {
            try (PreparedStatement stmt = con.prepareStatement("DELETE from todobot.tasklist WHERE id = (SELECT id from todobot.tasklist WHERE userid = ? ORDER BY name OFFSET ? LIMIT 1)")) {
                stmt.setLong(1, userId);
                stmt.setInt(2, num);
                boolean rs = stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void rename(Long userId, int index, String newListName) throws IllegalArgumentException {
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://77.221.141.195:5432/postgres", "postgres", "")) {
            try (PreparedStatement stmt = con.prepareStatement("UPDATE todobot.tasklist SET name = ? " +
                    "WHERE id = (SELECT id from todobot.tasklist WHERE userid = ? ORDER BY name OFFSET ? LIMIT 1)")) {
                stmt.setString(1, newListName);
                stmt.setLong(2, userId);
                stmt.setInt(3, index);
                boolean rs = stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectList(Long userId, int index) {
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://77.221.141.195:5432/postgres", "postgres", "")) {
            try (PreparedStatement stmt = con.prepareStatement("UPDATE todobot.tasklist SET isActive = false WHERE userid = ?")) {
                stmt.setLong(1, userId);
                boolean rs = stmt.execute();
            }
            try (PreparedStatement stmt = con.prepareStatement("UPDATE todobot.tasklist SET isActive = true " +
                    "WHERE id = (SELECT id from todobot.tasklist WHERE userid = ? ORDER BY name OFFSET ? LIMIT 1)")) {
                stmt.setLong(1, userId);
                stmt.setInt(2, index);
                boolean rs = stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Task> getTasksForActiveList(Long userid) {
        List<Task> lists = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://77.221.141.195:5432/postgres", "postgres", "")) {
            // use con here
            try (PreparedStatement stmt = con.prepareStatement("select t.id, text, t.tasklistid as tasklistid from todobot.task t " +
                    "join todobot.tasklist tl on t.tasklistid = tl.id " +
                    "where tl.isactive = true and tl.userid = ? " +
                    "order by t.text")) {
                // use stmt here
                stmt.setLong(1, userid);

                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    UUID id = UUID.fromString(rs.getString("id"));
                    UUID tasklistid = UUID.fromString(rs.getString("tasklistid"));
                    String text = rs.getString("text");

                    Task list = new Task();
                    list.setId(id);
                    list.setListId(tasklistid);
                    list.setText(text);
                    lists.add(list);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lists;
    }

}
