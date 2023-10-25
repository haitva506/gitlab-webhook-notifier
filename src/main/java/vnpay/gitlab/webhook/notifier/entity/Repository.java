package vnpay.gitlab.webhook.notifier.entity;

public class Repository {
    private String name;
    private String url;
    private String description;
    private String homepage;
    private String gitHttpUrl;
    private String gitSshUrl;
    private int visibilityLevel;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getGitHttpUrl() {
        return gitHttpUrl;
    }

    public String getGitSshUrl() {
        return gitSshUrl;
    }

    public int getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setGitHttpUrl(String gitHttpUrl) {
        this.gitHttpUrl = gitHttpUrl;
    }

    public void setGitSshUrl(String gitSshUrl) {
        this.gitSshUrl = gitSshUrl;
    }

    public void setVisibilityLevel(int visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }
}
