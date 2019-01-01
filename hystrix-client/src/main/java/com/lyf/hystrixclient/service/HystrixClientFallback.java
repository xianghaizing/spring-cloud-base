package com.lyf.hystrixclient.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements HelloServiceClient {

  @Override
  public String hello() {
    return "error-feign";
  }
  
}