package com.lyf.feginclient.controller;

import com.lyf.feginclient.service.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyf
 * @Date 2018/12/21 0021 13:36
 */
@RestController
@RequestMapping("feign")
public class ConsumerController {
  
  @Autowired
  private HelloServiceClient client;
  
  @GetMapping("hi")
  public String hi(){
    return client.hi();
  }
  
}
