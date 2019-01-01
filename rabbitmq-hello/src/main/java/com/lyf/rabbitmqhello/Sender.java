package com.lyf.rabbitmqhello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author lyf
 * @Date 2018/12/26 0026 11:57
 */
@Component
public class Sender {
  
  @Autowired
  private AmqpTemplate template;
  
  public void send(){
    String msg = "hello: "+new Date().toString();
    System.out.println("Sender: " + msg);
    this.template.convertAndSend("hello", msg);
  }
  
}
