package cn.wk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

import cn.wk.myrules.RandomRule_ZY;

/**
 * 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = { "cn.wk.springcloud" })
public class SpringCloudClientApp9001 {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public IRule ribbonRule() {
		return new RandomRule_ZY();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientApp9001.class, args);
	}
}
