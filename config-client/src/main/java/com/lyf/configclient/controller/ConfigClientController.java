package com.lyf.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyf
 * @Date 2018/12/24 0024 21:20
 */
@RefreshScope
@RestController
public class ConfigClientController {
  
  @Value("${from}")
  private String from;
  
  @RequestMapping("/from")
  public String getFrom(){
    return this.from;
  }
  
}
