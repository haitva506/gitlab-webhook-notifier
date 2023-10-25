package vnpay.gitlab.webhook.notifier.entity;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class ObjectAttributes {
    private int id;
    private int iid;
    private String ref;
    private boolean tag;
    private String sha;
    @JsonAlias("before_sha")
    private String beforeSha;
    private String source;
    private String status;
    @JsonAlias("detailed_status")
    private String detailedStatus;
    private List<String> stages;
    @JsonAlias("created_at")
    private String createdAt;
    @JsonAlias("finished_at")
    private String finishedAt;
    private int duration;
    @JsonAlias("queued_duration")
    private int queuedDuration;
    private List<Object> variables;

    public int getId() {
        return id;
    }

    public int getIid() {
        return iid;
    }

    public String getRef() {
        return ref;
    }

    public boolean isTag() {
        return tag;
    }

    public String getSha() {
        return sha;
    }

    public String getBeforeSha() {
        return beforeSha;
    }

    public String getSource() {
        return source;
    }

    public String getStatus() {
        return status;
    }

    public String getDetailedStatus() {
        return detailedStatus;
    }

    public List<String> getStages() {
        return stages;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public int getDuration() {
        return duration;
    }

    public int getQueuedDuration() {
        return queuedDuration;
    }

    public List<Object> getVariables() {
        return variables;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public void setBeforeSha(String beforeSha) {
        this.beforeSha = beforeSha;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    public void setStages(List<String> stages) {
        this.stages = stages;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setQueuedDuration(int queuedDuration) {
        this.queuedDuration = queuedDuration;
    }

    public void setVariables(List<Object> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return "ObjectAttributes{" +
                "id=" + id +
                ", iid=" + iid +
                ", ref='" + ref + '\'' +
                ", tag=" + tag +
                ", sha='" + sha + '\'' +
                ", beforeSha='" + beforeSha + '\'' +
                ", source='" + source + '\'' +
                ", status='" + status + '\'' +
                ", detailedStatus='" + detailedStatus + '\'' +
                ", stages=" + stages +
                ", createdAt='" + createdAt + '\'' +
                ", finishedAt='" + finishedAt + '\'' +
                ", duration=" + duration +
                ", queuedDuration=" + queuedDuration +
                ", variables=" + variables +
                '}';
    }
}
