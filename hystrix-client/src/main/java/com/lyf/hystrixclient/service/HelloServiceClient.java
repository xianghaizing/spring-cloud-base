package com.lyf.hystrixclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hello-service", fallback = HystrixClientFallback.class)
public interface HelloServiceClient {
  
  @RequestMapping(method = RequestMethod.GET, value = "/hello")
  String hello();

}
