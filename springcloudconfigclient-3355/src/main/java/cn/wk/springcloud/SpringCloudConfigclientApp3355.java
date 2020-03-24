package cn.wk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "cn.wk.springcloud" })
public class SpringCloudConfigclientApp3355 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigclientApp3355.class, args);
	}
}
