package com.lyf.hystrixclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lyf
 * @date 2018/12/21 0021 20:17
 */
@Service
public class HelloService {

  @Autowired
  private RestTemplate template;
  
  @HystrixCommand(fallbackMethod = "errorCallback")
  public String hello(){
    return template.getForObject("http://HELLO-SERVICE/hello",String.class);
  }

  public String errorCallback(){
    return "error";
  }
  
}
