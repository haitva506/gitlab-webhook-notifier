package vnpay.gitlab.webhook.notifier.entity;

public class Project {
    private int id;
    private String name;
    private String description;
    private String webUrl;
    private String gitSshUrl;
    private String gitHttpUrl;
    private String namespace;
    private int visibilityLevel;
    private String pathWithNamespace;
    private String defaultBranch;
    private String ciConfigPath;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getGitSshUrl() {
        return gitSshUrl;
    }

    public String getGitHttpUrl() {
        return gitHttpUrl;
    }

    public String getNamespace() {
        return namespace;
    }

    public int getVisibilityLevel() {
        return visibilityLevel;
    }

    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public String getCiConfigPath() {
        return ciConfigPath;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public void setGitSshUrl(String gitSshUrl) {
        this.gitSshUrl = gitSshUrl;
    }

    public void setGitHttpUrl(String gitHttpUrl) {
        this.gitHttpUrl = gitHttpUrl;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public void setVisibilityLevel(int visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public void setCiConfigPath(String ciConfigPath) {
        this.ciConfigPath = ciConfigPath;
    }
}
