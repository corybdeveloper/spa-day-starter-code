package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    private static final Map<Integer, User> userList = new HashMap<>();

    public static Collection<User> getAll() {
        return userList.values();
    }

    public static void add(User user) {
        userList.put(user.getId(), user);
    }

    public static User getById(int id) {
        return userList.get(id);
    }

    public static void remove(int id) {
            userList.remove(id);
    }

}
