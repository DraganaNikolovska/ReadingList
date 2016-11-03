package com.app;

import com.config.ApplicationConfiguration;
import com.config.SecurityConfig;
import com.domain.Reader;
import com.repository.ReaderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages = {"com.*"})
@ComponentScan
@EnableAutoConfiguration
@Import({ApplicationConfiguration.class, SecurityConfig.class})
public class SpringBootBookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootBookApplication.class, args);
		ReaderRepository readerRepository = context.getBean(ReaderRepository.class);
		Reader reader = new Reader();
		reader.setFullname("Dragana Nikolovska");
		reader.setUsername("gaga");
		reader.setPassword("123");
		readerRepository.save(reader);
	}
}
