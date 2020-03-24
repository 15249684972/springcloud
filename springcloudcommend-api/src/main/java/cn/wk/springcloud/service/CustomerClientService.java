package cn.wk.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.wk.springcloud.model.Customer;


@FeignClient(value = "HENGBOY-SPRING-CLOUD-EUREKA-PRODUCTION",fallbackFactory = DeptClientServiceFallbackFactory.class)
//@FeignClient(value = "HENGBOY-SPRING-CLOUD-EUREKA-PRODUCTION")
public interface CustomerClientService {
	
	@RequestMapping("getCustomerById/{id}")
	public Customer getCustomerById(@PathVariable("id") Long id);

	@RequestMapping(value = "getCustomer", method = RequestMethod.GET)
	public String getCustomer();

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insert();
}
