package com.example.intraday;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@EnableScheduling
@SpringBootApplication
public class IntradayApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);
	private static RestTemplateBuilder builder = new RestTemplateBuilder();

	public static void main(String[] args) {
		SpringApplication.run(IntradayApplication.class, args);
	}

	@Bean
	public static RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Scheduled(fixedRate = 1000)
	@Bean
	public static CommandLineRunner consumeAPI() throws Exception {
		RestTemplate restTemplate = restTemplate(builder);
		return args -> {
			IntraDay alphaAPI = restTemplate.getForObject(
					"https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=1min&apikey=demo", IntraDay.class);
			log.info(alphaAPI.toString());
		};
	}
}

