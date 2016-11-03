package com.config;

import com.listener.SpringBootBookApplicationListener;
import com.presentation.IndexController;
import com.presentation.LoginController;
import com.presentation.ReadingListController;
import com.repository.ReaderRepository;
import com.repository.ReadingListRepository;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by dragana.nikolovska on 10/31/2016.
 */
@Configuration
@EnableWebMvc
@EntityScan("com.domain")
@EnableJpaRepositories("com.repository")
public class ApplicationConfiguration {

    @Bean
    public IndexController indexController(){
        return new IndexController();
    }

    @Bean
    ReadingListController readingListController(ReadingListRepository readingListRepository) {
        return new ReadingListController(readingListRepository);
    }
    @Bean
    public SpringBootBookApplicationListener springBootBookApplicationListener(){
        return new SpringBootBookApplicationListener();
    }
    @Bean
    public LoginController loginController(){
        return new LoginController();
    }

}
