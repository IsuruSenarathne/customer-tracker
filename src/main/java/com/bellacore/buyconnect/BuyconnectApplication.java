package com.bellacore.buyconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = { HibernateJpaAutoConfiguration.class})
@ComponentScan
public class BuyconnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyconnectApplication.class, args);
	}

}
