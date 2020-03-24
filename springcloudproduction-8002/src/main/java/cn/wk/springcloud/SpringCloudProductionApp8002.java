package cn.wk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
//@ComponentScan(basePackages = {"cn.wk.service","cn.wk.controller","cn.wk.config"})
public class SpringCloudProductionApp8002 {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProductionApp8002.class, args);
	}
}
