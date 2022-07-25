package Messenger;

import static Messenger.ChatStatus.ADMIN;

public class ChatImitation {

    public static void start() {


        ICQ icq = new ICQ();
        User icqUser1 = new OrdinaryUser("Yura", icq);
        User icqUser2 = new OrdinaryUser("Dasha", icq);
        User icqUser3 = new OrdinaryUser("Nikita", icq);

        icq.addClient(icqUser1);
        icq.addClient(icqUser2);
        icq.addClient(icqUser3);

        icqUser1.sendMessage("Всем привет!");
        icqUser2.sendMessage("Hello everybody");

        User icqUser4 = new AdminUser("Valera", icq);
        icq.addClient(icqUser4);

    }
}
