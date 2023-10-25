package vnpay.gitlab.webhook.notifier.entity;

import java.util.List;

public class PipelineEvent extends GitLabWebhookEvent {
    private Project project;
    private User user;
    private Commit commit;
    private ObjectAttributes objectAttributes;
    private List<Build> builds;

    public ObjectAttributes getObjectAttributes() {
        return objectAttributes;
    }

    public void setObjectAttributes(ObjectAttributes objectAttributes) {
        this.objectAttributes = objectAttributes;
    }

    public Project getProject() {
        return project;
    }

    public User getUser() {
        return user;
    }

    public Commit getCommit() {
        return commit;
    }

    public List<Build> getBuilds() {
        return builds;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public void setBuilds(List<Build> builds) {
        this.builds = builds;
    }
}
