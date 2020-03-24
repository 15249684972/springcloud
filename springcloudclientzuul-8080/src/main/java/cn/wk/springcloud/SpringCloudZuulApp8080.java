package cn.wk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 *
 */
@SpringBootApplication
@EnableZuulProxy
//@ComponentScan(basePackages = { "cn.wk.springcloud" })
public class SpringCloudZuulApp8080 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApp8080.class, args);
	}
}
