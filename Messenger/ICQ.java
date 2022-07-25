package Messenger;

import java.util.ArrayList;

public class ICQ<T extends User> implements Chat {
    private ArrayList<T> users = new ArrayList<>();

    @Override
        public void sendMessage(String text, User me) {

            for (T user : users) {
                if (user.getId() != me.getId()) {
                    user.printMessage(text);
                }
            }
        }

    @Override
        public void addClient(User client) {
            System.out.println("\nДобавлен пользователь " + client.getName() + "\n");
            users.add((T) client);
        }
}


