package Messenger;

import java.util.ArrayList;

interface Admin<T> {

    void setStatus(User user, ChatStatus status);

    public void deleteUser(ArrayList<T> clients, User user);
}
