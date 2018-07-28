package ObserverPattern.BonusObserver;

import java.util.ArrayList;
import java.util.List;

public class JiraIssue {
    private String issueUpdate;
    private List<Watcher> watchers = new ArrayList<>();

    public void addObserver(Watcher watcher) {
        this.watchers.add(watcher);
    }

    public void removeObserver(Watcher watcher) {
        this.watchers.remove(watcher);
    }

    public void setIssueUpdate(String update){
        this.issueUpdate = update;
        for (Watcher watcher: watchers)
            watcher.update(this.issueUpdate);
    }

}
