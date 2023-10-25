package vnpay.gitlab.webhook.notifier.entity;

public class CommitEvent extends GitLabWebhookEvent {
    private ObjectAttributes objectAttributes;

    public ObjectAttributes getObjectAttributes() {
        return objectAttributes;
    }

    public void setObjectAttributes(ObjectAttributes objectAttributes) {
        this.objectAttributes = objectAttributes;
    }
}
