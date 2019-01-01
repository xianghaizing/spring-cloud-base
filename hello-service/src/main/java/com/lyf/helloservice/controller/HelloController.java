package com.lyf.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyf
 * @Date 2018/12/20 0020 16:53
 */
@RestController
public class HelloController {
  
  @GetMapping("hello")
  public String hello(){
    return "Hello World!";
  }
}
