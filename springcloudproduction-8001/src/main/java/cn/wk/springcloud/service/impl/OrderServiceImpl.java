package cn.wk.springcloud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wk.springcloud.mapper.manytoonemapper.OrderMapper;
import cn.wk.springcloud.model.manytoone.Order;
import cn.wk.springcloud.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public Order save(Order order) {
		Order save = orderMapper.save(order);
		return save;
	}

	@Override
	public List<Order> saveall(List<Order> order) {
		List<Order> orderList = (List<Order>) orderMapper.saveAll(order);
		return orderList;
	}

	@Override
	public Order findById(Long id) {
		Optional<Order> optional = orderMapper.findById(id);
		if (!optional.isPresent()) {
			return null;
		}
		return optional.get();
	}

	@Override
	public List<Order> findAll() {
		List<Order> listOrder = (List<Order>) orderMapper.findAll();
		return listOrder;
	}

	@Override
	public void delById(Long id) {
		orderMapper.deleteById(id);
	}

	@Override
	public void delAll() {
		orderMapper.deleteAll();

	}

}
