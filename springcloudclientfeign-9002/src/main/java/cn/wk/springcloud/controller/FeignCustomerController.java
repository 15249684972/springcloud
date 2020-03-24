package cn.wk.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wk.springcloud.model.Customer;
import cn.wk.springcloud.service.CustomerClientService;

@RestController
public class FeignCustomerController {

	@Autowired
	private CustomerClientService customerClientService;

	@RequestMapping("getCustomerById/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		Customer customer = customerClientService.getCustomerById(id);
		return customer;
	}

	@RequestMapping(value = "getCustomer")
	public String getCustomer() {
		return this.customerClientService.getCustomer();
	}

	@RequestMapping(value = "insert")
	public String insert() {
		return this.customerClientService.insert();
	}
}
