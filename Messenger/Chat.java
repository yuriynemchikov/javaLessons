package Messenger;

public interface Chat {
    public void sendMessage(String text, User user);

    public void addClient(User user);
}
