package vnpay.gitlab.webhook.notifier.entity;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Date;

public class Build {
    private int id;

    private String stage;

    private String name;

    private String status;

    @JsonAlias("created_at")
    private String createdAt;

    @JsonAlias("started_at")
    private String startedAt;

    @JsonAlias("finished_at")
    private String finishedAt;

    private double duration;

    @JsonAlias("queued_duration")
    private double queuedDuration;

    @JsonAlias("failure_reason")
    private String failureReason;

    private String when;

    private boolean manual;

    @JsonAlias("allow_failure")
    private boolean allowFailure;

    private User user;

    private Runner runner;

    private String environment;

    public int getId() {
        return id;
    }

    public String getStage() {
        return stage;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public double getDuration() {
        return duration;
    }

    public double getQueuedDuration() {
        return queuedDuration;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public String getWhen() {
        return when;
    }

    public boolean isManual() {
        return manual;
    }

    public boolean isAllowFailure() {
        return allowFailure;
    }

    public User getUser() {
        return user;
    }

    public Runner getRunner() {
        return runner;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setQueuedDuration(double queuedDuration) {
        this.queuedDuration = queuedDuration;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public void setAllowFailure(boolean allowFailure) {
        this.allowFailure = allowFailure;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }
}
