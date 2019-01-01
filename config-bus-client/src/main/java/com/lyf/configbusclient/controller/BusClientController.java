package com.lyf.configbusclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyf
 * @Date 2018/12/26 0026 18:49
 */
@RefreshScope
@RestController
public class BusClientController {

  @Value("${from}")
  private String from;

  @GetMapping("/from")
  public String getFrom(){
    return this.from;
  }

}
