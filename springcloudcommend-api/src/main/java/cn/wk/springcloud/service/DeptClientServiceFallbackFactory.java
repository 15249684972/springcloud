package cn.wk.springcloud.service;

import org.springframework.stereotype.Component;

import cn.wk.springcloud.model.Customer;
import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<CustomerClientService> {

	@Override
	public CustomerClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new CustomerClientService(){

			@Override
			public Customer getCustomerById(Long id) {
				return new Customer().setCust_id(id).setCust_name("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
						.setCust_source("no this database in MySQL");
			} 
			
			@Override
			public String getCustomer() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String insert() {
				// TODO Auto-generated method stub
				return null;
			}

		};
	}

}
