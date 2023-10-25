package vnpay.gitlab.webhook.notifier.entity;

public class Commit {
    private String id;
    private String name;
    private String sha;
    private String message;
    private String authorName;
    private String authorEmail;
    private String authorUrl;
    private String status;
    private String duration;
    private String startedAt;
    private String finishedAt;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSha() {
        return sha;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public String getStatus() {
        return status;
    }

    public String getDuration() {
        return duration;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }
}
