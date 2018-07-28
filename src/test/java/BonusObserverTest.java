import ObserverPattern.BonusObserver.JiraIssue;
import ObserverPattern.BonusObserver.JiraWatcher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusObserverTest {

    @Test
    public void watchJiraUpdateTest(){
        JiraIssue jiraIssue = new JiraIssue();
        JiraWatcher currentUser = new JiraWatcher("current_user@jira.com");

        jiraIssue.addObserver(currentUser);
        jiraIssue.setIssueUpdate(
                "new Comment has been added"
        );
        assertEquals(currentUser.getIssueUpdate(),
                "new Comment has been added");
    }
}
