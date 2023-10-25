package vnpay.gitlab.webhook.notifier.entity;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class PushEvent extends GitLabWebhookEvent {
    @JsonAlias("event_name")
    private String eventName;
    private String before;
    private String after;
    private String ref;
    @JsonAlias("ref_protected")
    private String refProtected;
    @JsonAlias("checkout_sha")
    private String checkoutSha;
    @JsonAlias("user_id")
    private String userId;
    @JsonAlias("user_name")
    private String userName;
    @JsonAlias("user_username")
    private String userUsername;
    @JsonAlias("user_email")
    private String userEmail;
    @JsonAlias("user_avatar")
    private String userAvatar;
    @JsonAlias("project_id")
    private String projectId;
    private Project project;
    private List<Commit> commits;
    private Repository repository;

    public String getEventName() {
        return eventName;
    }

    public String getBefore() {
        return before;
    }

    public String getAfter() {
        return after;
    }

    public String getRef() {
        return ref;
    }

    public String getRefProtected() {
        return refProtected;
    }

    public String getCheckoutSha() {
        return checkoutSha;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public String getProjectId() {
        return projectId;
    }

    public Project getProject() {
        return project;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setRefProtected(String refProtected) {
        this.refProtected = refProtected;
    }

    public void setCheckoutSha(String checkoutSha) {
        this.checkoutSha = checkoutSha;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }
}
