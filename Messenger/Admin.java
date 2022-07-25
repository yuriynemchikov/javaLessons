package Messenger;

import java.util.ArrayList;

public interface Admin<T> {

    void setStatus(User user, ChatStatus status);

    public void deleteUser(ArrayList<T> clients);
}
