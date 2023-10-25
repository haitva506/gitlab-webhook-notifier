package vnpay.gitlab.webhook.notifier.biz.telegram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TelegramNotifierAGRBiz extends TelegramNotifierBiz {
    @Value("${telegram.agr.api-token}")
    private String apiToken;

    @Value("${telegram.agr.chat-id}")
    private String chatId;

    @Override
    public String getApiToken() {
        return apiToken;
    }

    @Override
    public String getChatId() {
        return chatId;
    }
}
