package cn.wk.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.wk.springcloud.model.manytoone.Order;
import cn.wk.springcloud.service.OrderService;

@RestController
public class OrderCintroller {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "saveall", method = RequestMethod.POST)
	public List<Order> saveall(List<Order> orders) {
		List<Order> saveList = orderService.saveall(orders);
		return saveList;
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public Order save(Order order) {
		Order save = orderService.save(order);
		return save;
	}
	
	@RequestMapping(value="find/{id}",method=RequestMethod.GET)
	public Order findById(@PathVariable("id") Long id){
		Order order = orderService.findById(id);
		return order;
	}
	
	@RequestMapping(value="findAll",method=RequestMethod.GET)
	public List<Order> findAll(){
		List<Order> orderList = orderService.findAll();
		return orderList;
	}
	
	@RequestMapping(value="delete/{id}",method=RequestMethod.GET)
	public void deleteById(@PathVariable("id") Long id){
		orderService.delById(id);
	}
	
	@RequestMapping(value="deleteAll/{id}",method=RequestMethod.GET)
	public void deleteAll(){
		orderService.delAll();
	}
}
