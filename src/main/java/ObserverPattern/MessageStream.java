package ObserverPattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {
    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    public void setState(String state) {
        messageHistory.add(state);
        this.notifyObservers();
    }

    @Override
    public String getState() {
        return messageHistory.getLast();
    }
}
