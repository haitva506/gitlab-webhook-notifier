package vnpay.gitlab.webhook.notifier.entity;

import com.fasterxml.jackson.annotation.JsonAlias;

public class BuildEvent extends GitLabWebhookEvent {
    private String ref;
    private String tag;
    @JsonAlias("before_sha")
    private String beforeSha;
    private String sha;
    @JsonAlias("build_id")
    private String buildId;
    @JsonAlias("build_name")
    private String buildName;
    @JsonAlias("build_stage")
    private String buildStage;
    @JsonAlias("build_status")
    private String buildStatus;
    @JsonAlias("build_created_at")
    private String buildCreatedAt;
    @JsonAlias("build_started_at")
    private String buildStartedAt;
    @JsonAlias("build_finished_at")
    private String buildFinishedAt;
    @JsonAlias("build_duration")
    private String buildDuration;
    @JsonAlias("build_queued_duration")
    private String buildQueuedDuration;
    @JsonAlias("build_allow_failure")
    private String buildAllowFailure;
    @JsonAlias("build_failure_reason")
    private String buildFailureReason;
    @JsonAlias("pipeline_id")
    private String pipelineId;
    private String runner;
    @JsonAlias("project_id")
    private String projectId;
    @JsonAlias("project_name")
    private String projectName;
    private User user;
    private Commit commit;
    private Repository repository;
    private ObjectAttributes objectAttributes;

    public ObjectAttributes getObjectAttributes() {
        return objectAttributes;
    }

    public void setObjectAttributes(ObjectAttributes objectAttributes) {
        this.objectAttributes = objectAttributes;
    }

    public User getUser() {
        return user;
    }

    public Commit getCommit() {
        return commit;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRef() {
        return ref;
    }

    public String getTag() {
        return tag;
    }

    public String getBeforeSha() {
        return beforeSha;
    }

    public String getSha() {
        return sha;
    }

    public String getBuildId() {
        return buildId;
    }

    public String getBuildName() {
        return buildName;
    }

    public String getBuildStage() {
        return buildStage;
    }

    public String getBuildStatus() {
        return buildStatus;
    }

    public String getBuildCreatedAt() {
        return buildCreatedAt;
    }

    public String getBuildStartedAt() {
        return buildStartedAt;
    }

    public String getBuildFinishedAt() {
        return buildFinishedAt;
    }

    public String getBuildDuration() {
        return buildDuration;
    }

    public String getBuildQueuedDuration() {
        return buildQueuedDuration;
    }

    public String getBuildAllowFailure() {
        return buildAllowFailure;
    }

    public String getBuildFailureReason() {
        return buildFailureReason;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public String getRunner() {
        return runner;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setBeforeSha(String beforeSha) {
        this.beforeSha = beforeSha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public void setBuildStage(String buildStage) {
        this.buildStage = buildStage;
    }

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    public void setBuildCreatedAt(String buildCreatedAt) {
        this.buildCreatedAt = buildCreatedAt;
    }

    public void setBuildStartedAt(String buildStartedAt) {
        this.buildStartedAt = buildStartedAt;
    }

    public void setBuildFinishedAt(String buildFinishedAt) {
        this.buildFinishedAt = buildFinishedAt;
    }

    public void setBuildDuration(String buildDuration) {
        this.buildDuration = buildDuration;
    }

    public void setBuildQueuedDuration(String buildQueuedDuration) {
        this.buildQueuedDuration = buildQueuedDuration;
    }

    public void setBuildAllowFailure(String buildAllowFailure) {
        this.buildAllowFailure = buildAllowFailure;
    }

    public void setBuildFailureReason(String buildFailureReason) {
        this.buildFailureReason = buildFailureReason;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public void setRunner(String runner) {
        this.runner = runner;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
