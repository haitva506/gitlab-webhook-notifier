package vnpay.gitlab.webhook.notifier.biz.telegram;

import vnpay.gitlab.webhook.notifier.constant.EventType;
import vnpay.gitlab.webhook.notifier.entity.*;

public class MessageContentBuilderBiz {
    public static String buildContentMessageByEventType(GitLabWebhookEvent message) {
        String content = "";
        if (message instanceof BuildEvent) {
            BuildEvent buildEvent = (BuildEvent) message;
            content = String.format(getBaseMessage(), buildEvent.getRepository().getName(), EventType.EVN_TYPE_BUILD.toUpperCase(), buildEvent.getUser().getName()) +
                    "\n\n" +
                    getMessageBuildEvent(buildEvent);
        }

        if (message instanceof PushEvent) {
            PushEvent pushEvent = (PushEvent) message;
            content = String.format(getBaseMessage(), pushEvent.getRepository().getName(), EventType.EVN_TYPE_PUSH.toUpperCase(), pushEvent.getUserName()) +
                    "\n\n" +
                    getMessagePushEvent(pushEvent);
        }

        if (message instanceof PipelineEvent) {
            PipelineEvent pipelineEvent = (PipelineEvent) message;
            content = String.format(getBaseMessage(), pipelineEvent.getProject().getName(), EventType.EVN_TYPE_PIPELINE.toUpperCase(), pipelineEvent.getUser().getName()) +
                    "\n\n" +
                    getMessagePipelineEvent(pipelineEvent);
        }

        return content;
    }

    public static String getMessageBuildEvent(BuildEvent buildEvent) {
        StringBuilder message = new StringBuilder();

        message.append("Stage: ").append(buildEvent.getBuildStage());
        message.append("\n\n");
        message.append("Status: ").append("<b>").append(buildEvent.getBuildStatus()).append("</b>");
        message.append("\n\n");
        message.append("Created time:").append(buildEvent.getBuildCreatedAt());
        message.append("\n\n");
        message.append("Commit message: ").append(buildEvent.getCommit().getMessage());

        return message.toString();
    }

    public static String getMessagePipelineEvent(PipelineEvent pipelineEvent) {
        StringBuilder message = new StringBuilder();

        message.append("<b>Build Information's:</b> ");
        message.append("[");
        for (Build build : pipelineEvent.getBuilds()) {
            message.append("{\n\n");
            message.append("\t\tName: ").append(build.getName()).append("\n\n");
            message.append("\t\tStage: ").append(build.getStage()).append("\n\n");
            message.append("\t\tStatus: ").append("<b>").append(build.getStatus()).append("</b>").append("\n\n");
            message.append("\t\tRunner: ").append(build.getRunner().getDescription()).append("\n\n");
            message.append("}");
        }
        message.append("]");

        return message.toString();
    }

    public static String getMessagePushEvent(PushEvent pushEvent) {
        StringBuilder message = new StringBuilder();

        message.append("<b>Commit message:</b> ");
        for (Commit commit : pushEvent.getCommits()) {
            message.append(commit.getMessage()).append("\n\n");
        }

        return message.toString();
    }

    public static String getBaseMessage() {
        StringBuilder message = new StringBuilder();

        message.append("<b>[GIT-LAB NOTIFY]</b>");
        message.append("\n\n");
        message.append("<b>Project</b>: %s");
        message.append("\n\n");
        message.append("<b>Event</b>: %s");
        message.append("\n\n");
        message.append("<b>User</b>: %s");

        return message.toString();
    }
}
