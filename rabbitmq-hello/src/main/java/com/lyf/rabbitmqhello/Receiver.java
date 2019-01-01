package com.lyf.rabbitmqhello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author lyf
 * @Date 2018/12/26 0026 12:01
 */
@Component
public class Receiver {

  @RabbitListener(queues = "hello")
  public void process(String hello){
    System.out.println("Reciver: "+ hello);
  }
}
