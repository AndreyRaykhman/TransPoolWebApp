package transpool.logic.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserManager {
    private Map<String, User> allUsers;

    public UserManager() {
        this.allUsers = new HashMap<>();
    }

    public synchronized void addUser(String userName){
        this.allUsers.put(userName, new User(userName));
    }

    public synchronized void removeUser(User username) {
        this.allUsers.remove(username.getName());
    }

    public synchronized User getUser(String userName){
        return this.allUsers.get(userName);
    }

    public boolean userExist(String userName){
        return this.allUsers.containsKey(userName);
    }

    public Map<String, User> getUsers() {
        return allUsers;
    }
}
