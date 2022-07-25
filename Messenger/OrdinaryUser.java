package Messenger;

import java.util.UUID;

public class OrdinaryUser extends User {


    public OrdinaryUser(String username, Chat chatRoom) {
        super(username, chatRoom);
        ChatStatus status = ChatStatus.ORDINARY;
    }
}
