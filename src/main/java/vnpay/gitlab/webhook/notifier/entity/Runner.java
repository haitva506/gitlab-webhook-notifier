package vnpay.gitlab.webhook.notifier.entity;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Runner {
    private int id;
    private String description;
    @JsonAlias("runner_type")
    private String runnerType;
    private boolean active;
    @JsonAlias("is_shared")
    private boolean isShared;
    private List<String> tags;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getRunnerType() {
        return runnerType;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isShared() {
        return isShared;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRunnerType(String runnerType) {
        this.runnerType = runnerType;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setShared(boolean shared) {
        isShared = shared;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
