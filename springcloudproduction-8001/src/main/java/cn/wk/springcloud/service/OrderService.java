package cn.wk.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.wk.springcloud.model.manytoone.Order;

@Service
public interface OrderService {

	public Order save(Order order);

	public List<Order> saveall(List<Order> order);

	public Order findById(Long id);

	public List<Order> findAll();

	public void delById(Long id);

	public void delAll();

}
