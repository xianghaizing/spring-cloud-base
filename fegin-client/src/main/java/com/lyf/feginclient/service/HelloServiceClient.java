package com.lyf.feginclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author lyf
 * @Date 2018/12/21 0021 13:32
 */

@FeignClient("hello-service")
public interface HelloServiceClient {
  
  @RequestMapping(method = RequestMethod.GET, value = "/hello")
  String hi();
  
}
