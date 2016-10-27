package br.ufsc.grad.renatoback.tcc.post.service.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostServiceMqApplication {

	public static final String QUEUE_NAME = "send-package.queue";
	public static final String EXCHANGE_NAME = "customer-creation.exchange";

	public static void main(String[] args) {
		SpringApplication.run(PostServiceMqApplication.class, args);
	}
}
