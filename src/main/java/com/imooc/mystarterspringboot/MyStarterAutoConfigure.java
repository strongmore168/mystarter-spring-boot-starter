package com.imooc.mystarterspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MyStarterService.class)
@EnableConfigurationProperties(MyStarterServiceProperties.class)
public class MyStarterAutoConfigure {

  @Autowired
  private MyStarterServiceProperties properties;

  @Bean
  public MyStarterService myStarterService() {
    System.out.println("mystarter-spring-boot-starter run success:" + properties);
    return new MyStarterService(properties.getUsername(), properties.getPassword());
  }
}