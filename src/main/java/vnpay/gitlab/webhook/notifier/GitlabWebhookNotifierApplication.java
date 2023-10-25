package vnpay.gitlab.webhook.notifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitlabWebhookNotifierApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitlabWebhookNotifierApplication.class, args);
    }
}

