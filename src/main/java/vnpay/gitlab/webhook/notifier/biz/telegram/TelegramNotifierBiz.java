package vnpay.gitlab.webhook.notifier.biz.telegram;

import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public abstract class TelegramNotifierBiz {
    @Value("${telegram.url}")
    private String url;

    @Value("${telegram.default.api-token}")
    private String apiToken;

    @Value("${telegram.default.chat-id}")
    private String chatId;

    public String getUrl() {
        return url;
    }

    public String getApiToken() {
        return apiToken;
    }

    public String getChatId() {
        return chatId;
    }

    public String sendMessage(String text) {
        String response = "";
        String urlString = String.format(getUrl(), getApiToken(), getChatId(), URLEncoder.encode(text));

        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();

            InputStream is = new BufferedInputStream(conn.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            StringBuilder sb = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }

            response = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }
}
