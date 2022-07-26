package Messenger;

import java.util.UUID;

public abstract class User {
    protected UUID id;
    protected String userName;
    protected Chat chatRoom;
    protected ChatStatus status;

    public User (String username, Chat chatRoom) {
        this.userName = username;
        this.id = UUID.randomUUID();
        this.chatRoom = chatRoom;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return userName;
    }

    public Chat getChatRoom() {
        return chatRoom;
    }

    public ChatStatus getStatus(){
        return status;
    }

    public void sendMessage(String text){
        chatRoom.sendMessage(text, this);
    }

    public void printMessage(String msg){
        System.out.printf("%s (%s): %s\n", getName(), getStatus(), msg);
    }

}
