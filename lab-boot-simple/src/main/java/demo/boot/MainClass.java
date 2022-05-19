package demo.boot;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication//(scanBasePackages ="com.boot" )
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

	@Bean
	public RestTemplate  getRestTemplate(RestTemplateBuilder builder)
	{
		return builder.setConnectTimeout(Duration.ofMillis(5000)).build();
	}
}
