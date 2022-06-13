package com.example.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class DemoApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class, MyLoggerConfig.class);

        deneme.Coach tennisCoach1 = context.getBean("denemeCoach", deneme.Coach.class);

        Coach tennisCoach2 = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach1.getDailyWorkout());

        System.out.println(tennisCoach2.getDailyWorkout());

        System.out.println(tennisCoach2.getDailyFortune());

        System.out.println(tennisCoach2.doSomeCrazyStuff());

        System.out.println("is equal? " + (tennisCoach1 == tennisCoach2));

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());

        System.out.println(swimCoach.getDailyFortune());

        System.out.println(swimCoach.doSomeCrazyStuff());

        System.out.println(swimCoach.getEmail());

        System.out.printf(swimCoach.getTeam());

        //Since you used @Bean in configuration file, no need for Component scan!
        BasketballCoach basketballCoach = context.getBean("basketballCoach", BasketballCoach.class);

        System.out.println(basketballCoach.getDailyFortune());


        context.close();

    }

}
