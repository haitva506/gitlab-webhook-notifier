package vnpay.gitlab.webhook.notifier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vnpay.gitlab.webhook.notifier.biz.telegram.MessageContentBuilderBiz;
import vnpay.gitlab.webhook.notifier.biz.telegram.TelegramNotifierAGRBiz;
import vnpay.gitlab.webhook.notifier.entity.GitLabWebhookEvent;

@RestController
@RequestMapping("/webhook")
public class WebhookController {
    @Autowired
    TelegramNotifierAGRBiz telegramNotifierAGRBiz;

    @RequestMapping(value = "/agr/notify", method = RequestMethod.POST)
    public String agrNotify(@RequestBody GitLabWebhookEvent body) {
        System.out.println(body);
        String message = MessageContentBuilderBiz.buildContentMessageByEventType(body);

        return telegramNotifierAGRBiz.sendMessage(message);
    }
}