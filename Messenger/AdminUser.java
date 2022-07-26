package Messenger;

import java.util.ArrayList;

public class AdminUser extends User implements Admin{

    public AdminUser(String username, Chat chatRoom) {
        super(username, chatRoom);
        ChatStatus status = ChatStatus.ADMIN;
    }

    @Override
    public void setStatus(User user, ChatStatus status) {
        System.out.println(user.getName() + "теперь" + status);
        this.status = status;
    }

    @Override
    public void deleteUser(ArrayList users, User user) {
        users.remove(user.getId());
    }
}
