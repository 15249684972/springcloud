package cn.wk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 *
 */
@SpringBootApplication
@EnableEurekaServer
//@ComponentScan(basePackages = {"cn.wk.service","cn.wk.controller","cn.wk.config"})
public class SpringCloudServerApp7001 {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerApp7001.class, args);
	}
}
