package ObserverPattern.BonusObserver;

public class JiraWatcher implements Watcher {
    private String email;
    private String issueUpdate;

    public JiraWatcher(String email) {
        this.email = email;
    }

    public String getIssueUpdate() {
        return issueUpdate;
    }

    private void sendEmailWithUpdate() {
      System.out.println(
              "JIRA has sent an email to " + email +
                      " with notification: \n '" + issueUpdate + "'");
  }

    @Override
    public void update(Object issueUpdate) {
        this.issueUpdate = (String) issueUpdate;
        sendEmailWithUpdate();
    }
}
