
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message test = new Message("pov", "test message");
        MessageService inbox = new MessageService();
        inbox.add(test);
        System.out.println(inbox.getMessages());
    }
}
