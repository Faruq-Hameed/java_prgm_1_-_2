package part_9;
public class TextMessage implements Readable {
    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String read() {
        return this.content;
    }

    public String getSender() {
        return this.sender;
    }
}
