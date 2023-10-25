package vnpay.gitlab.webhook.notifier.controller;

import vnpay.gitlab.webhook.notifier.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String home() {
		return "Hello";
	}
}