package cn.wk.springcloud.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.wk.springcloud.SpringCloudProductionApp8001;
import cn.wk.springcloud.mapper.manytoonemapper.CustomerTwoMapper;
import cn.wk.springcloud.model.manytoone.Customer;
import cn.wk.springcloud.model.manytoone.Order;
import cn.wk.springcloud.service.OrderService;

@RunWith(SpringRunner.class)
@TestConfiguration
@SpringBootTest(classes = SpringCloudProductionApp8001.class)
public class ManyToOne {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CustomerTwoMapper customerTwoMapper;

	@Test
	public void saveall() {
		List<Order> orderList = new ArrayList<Order>();
		Order order1 = new Order();
		order1.setOrder_name("orderA");
		Order order2 = new Order();
		order2.setOrder_name("orderB");

		Customer customer = new Customer();
		customer.setCustomer_id(1L);
		customer.setCustomer_name("customerA");

		order1.setCustomer(customer);
		order2.setCustomer(customer);

		orderList.add(order1);
		orderList.add(order2);

		List<Order> saveList = orderService.saveall(orderList);
		for (Order order : saveList) {
			System.out.println(order.getOrder_name());
		}
	}

	@Test
	public void save() {
		Order order = new Order();
		order.setOrder_id(1l);
		order.setOrder_name("orderA");
		Customer customer = new Customer();
		customer.setCustomer_id(1L);
		customer.setCustomer_name("customerA");
		order.setCustomer(customer);
		orderService.save(order);
	}

	@Test
	public void findById() {
		Order order = orderService.findById(5l);
		String order_name = order.getOrder_name();
		System.out.println(order_name);
		String customer_name = order.getCustomer().getCustomer_name();
		System.out.println(customer_name);
	}

	@Test
	public void findAll() {
		// List<Order> orderList = orderService.findAll();
	}

	@Test
	public void deleteById() {
		//orderService.delById(1l);
		customerTwoMapper.deleteById(5l);
	}

	@Test
	public void deleteAll() {
		orderService.delAll();
	}
	
}
