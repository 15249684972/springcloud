package cn.wk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"cn.wk.springcloud.service","cn.wk.springcloud.config","cn.wk.springcloud.controller"})
public class SpringCloudProductionApp8001 {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProductionApp8001.class, args);
	}
}
