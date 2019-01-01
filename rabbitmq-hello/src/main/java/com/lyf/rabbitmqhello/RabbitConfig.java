package com.lyf.rabbitmqhello;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lyf
 * @Date 2018/12/26 0026 12:03
 */
@Configuration
public class RabbitConfig {
  
  @Bean
  public Queue queue(){
    return new Queue("hello");
  }
  
}
