package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.example.demo") //TODO: If you are using @Bean, you do not need to use this!
@ComponentScan("deneme") //Bu bir deneme, best practice nedir ogrenmek lazim!
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach basketballCoach(){ //TODO: method name is the bean ID here!!!!
        BasketballCoach mySwingCoach = new BasketballCoach(sadFortuneService());

        return mySwingCoach;
    }


}
