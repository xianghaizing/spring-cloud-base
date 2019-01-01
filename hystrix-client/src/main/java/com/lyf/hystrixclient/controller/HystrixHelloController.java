package com.lyf.hystrixclient.controller;

import com.lyf.hystrixclient.service.HelloService;
import com.lyf.hystrixclient.service.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyf
 * @Date 2018/12/21 0021 17:57
 */
@RestController
@RequestMapping("hystrix")
public class HystrixHelloController {

  @Autowired
  private HelloService helloService;

  @Autowired
  private HelloServiceClient client;
  
  @GetMapping("hi")
  public String hi(){
    return helloService.hello();
  }
  
  @GetMapping("he")
  public String he(){
    return client.hello();
  }
  
  
}
