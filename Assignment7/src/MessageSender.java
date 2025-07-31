interface Messenger {
    String sendMessage(String message);
}

class TextMessenger implements Messenger {
    public String sendMessage(String message) {
        return "Text sent: " + message;
    }
}

class VoiceMessenger implements Messenger {
    public String sendMessage(String message) {
        return "Voice sent: " + message;
    }
}

public class MessageSender {
    public static void main(String[] args) {
        Messenger text = new TextMessenger();
        Messenger voice = new VoiceMessenger();
        System.out.println(text.sendMessage("Hello"));
        System.out.println(voice.sendMessage("Hello"));
    }
}
