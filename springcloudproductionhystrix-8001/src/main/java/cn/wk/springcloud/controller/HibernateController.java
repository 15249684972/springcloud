package cn.wk.springcloud.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.wk.springcloud.model.Customer;
import cn.wk.springcloud.service.CustomerService;

@RestController
public class HibernateController {

	@Autowired
	CustomerService customerService;

	@Autowired
	Customer customer;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public Customer test() {
		return customer;
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("getCustomerById/{id}")
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Customer getCustomerById(@PathVariable Long id) {
		Customer customer = customerService.getCustomerById(id);
		if (customer == null) {
			throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
		}
		return customer;
	}

	public Customer processHystrix_Get(Long id) {
		return new Customer().setCust_id(id).setCust_name("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setCust_source("no this database in MySQL");
	}

	/**
	 * 查询
	 * 
	 * @return
	 */
	@RequestMapping("getCustomer")
	public List<Customer> getCustomer() {
		List<Customer> customer2 = customerService.getCustomer();

		return customer2;
	}

	/**
	 * 添加
	 * 
	 * @return
	 * @throws Throwable
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public HashMap<String, Object> insert() {
		int code = 0;
		String msg = null;
		Customer customer = new Customer();
		customer.setCust_name("东东");
		customer.setCust_source("小红本");
		Customer cus;
		try {
			cus = customerService.insertCustomer(customer);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			code = 500;
			msg = e.getMessage();
		}
		HashMap<String, Object> msgMap = new HashMap<>();
		msgMap.put("code", code);
		msgMap.put("msg", msg);
		return msgMap;
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	@RequestMapping("delete")
	public void delete(Long id) {

	}

	/**
	 * 更新
	 * 
	 * @param customer
	 * @return
	 */
	@RequestMapping("updata")
	public String updata(Customer customer) {

		return "SUCCESS";
	}

}
