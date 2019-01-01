package comlyf.ribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lyf
 * @Date 2018/12/20 0020 17:01
 */
@RestController
@RequestMapping("con")
public class ConsumerController {

  @Autowired
  private RestTemplate template;
  
  @Value("${hello.serviceUrl}")
  private String helloServiceUrl;

  /**
   * 非负载均衡请求 
   * @return
   */
  @GetMapping("hello01")
  public String hello01(){
    return template.getForObject(helloServiceUrl, String.class);
  }

  /**
   * 负载均衡请求
   * @return
   */
  @GetMapping("hello02")
  public String hello02(){
    return template.getForObject("http://HELLO-SERVICE/hello", String.class);
  }

}
