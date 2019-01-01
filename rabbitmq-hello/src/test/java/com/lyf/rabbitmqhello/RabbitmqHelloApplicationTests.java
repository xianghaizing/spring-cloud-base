package com.lyf.rabbitmqhello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqHelloApplicationTests {

  @Autowired
  private Sender sender;
  
  @Test
  public void contextLoads() throws InterruptedException {
    for (int i = 0; i < 1000; i++) {
      Thread.sleep((long) (Math.random()*3000));
      sender.send();
    }
  }

}

