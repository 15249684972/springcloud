package cn.wk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 *
 */
@SpringBootApplication
@EnableConfigServer
//@ComponentScan(basePackages = { "cn.wk.springcloud" })
public class SpringCloudConfigApp3344 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigApp3344.class, args);
	}
}
