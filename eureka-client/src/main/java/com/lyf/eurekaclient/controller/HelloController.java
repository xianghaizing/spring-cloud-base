package com.lyf.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyf
 * @Date 2018/12/20 0020 14:36
 */
@RestController
public class HelloController {
  
  @GetMapping("hello")
  public String hello(){
    return "Hello World!";
  }
}
