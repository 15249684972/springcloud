package cn.wk.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.wk.springcloud.model.Customer;


@Configuration
public class MyConfigration {

	@Bean
    public Customer getCustomer() {
		Customer customer=new Customer();
		customer.setCust_level("6666");
        return customer;
    }
	
}
