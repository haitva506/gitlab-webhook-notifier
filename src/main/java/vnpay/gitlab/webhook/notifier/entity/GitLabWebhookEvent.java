package vnpay.gitlab.webhook.notifier.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import vnpay.gitlab.webhook.notifier.constant.EventType;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "object_kind")   // field on which we differentiate objects
@JsonSubTypes({
        @JsonSubTypes.Type(value = BuildEvent.class, name = EventType.EVN_TYPE_BUILD),
        @JsonSubTypes.Type(value = PushEvent.class, name = EventType.EVN_TYPE_PUSH),
        @JsonSubTypes.Type(value = PipelineEvent.class, name = EventType.EVN_TYPE_PIPELINE)
})
public abstract class GitLabWebhookEvent {
    @JsonAlias("object_kind")
    private String objectKind;

    public String getObjectKind() {
        return objectKind;
    }

    public void setObjectKind(String objectKind) {
        this.objectKind = objectKind;
    }
}
