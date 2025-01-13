import java.util.ArrayList;

public class MessageService {
  private ArrayList<Message> messages = new ArrayList<>();

  public MessageService() {
    this.messages = new ArrayList<>();
  }

  public void add(Message message) {
    if (message.getContent().length() <= 280) {
      messages.add(message);
    }
  }

  public ArrayList<Message> getMessages() {
    return messages;
  }
}
