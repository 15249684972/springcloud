package cn.wk.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CusController {
	
	private static final String url="http://HENGBOY-SPRING-CLOUD-EUREKA-PRODUCTION";
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="getCustomer")
	public String getCustomer(){
		return restTemplate.getForEntity(url+"/getCustomer", String.class).getBody();
	}
	
	@RequestMapping(value="insert")
	public String insert(){
		return restTemplate.getForObject(url+"/insert", String.class);
	}
	

}
