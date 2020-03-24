package cn.wk.springcloud.model;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.wk.springcloud.SpringCloudProductionApp8001;
import cn.wk.springcloud.mapper.onetomanymapper.CustomerOneToManyMapper;
import cn.wk.springcloud.model.onetomany.Customer;
import cn.wk.springcloud.model.onetomany.Order;

@RunWith(SpringRunner.class)
@TestConfiguration
@SpringBootTest(classes = SpringCloudProductionApp8001.class)
public class OneToMany {
	
	@Autowired
	private CustomerOneToManyMapper customerMapper;
	
	@Test
	public void save(){
		Customer customer=new Customer();
		customer.setCustomer_id(1l);
		customer.setCustomer_name("customerA");
		
		Order order1=new Order();
		order1.setOrder_name("orderA");
		Order order2=new Order();
		order2.setOrder_name("orderB");
		
		customer.getOrders().add(order1);
		//customer.getOrders().add(order2);
		customerMapper.save(customer);
		
	}
	
	@Test
	public void saveAll(){
		
	}
	
	@Test
	public void get(){
		Optional<Customer> customer = customerMapper.findById(1l);
		Optional<Customer> customer2 = customerMapper.findById(1l);
		if(!customer.isPresent()){
			return;
		}
		Customer customer3 = customer.get();
		customer3.getCustomer_name();
		String order_name = customer3.getOrders().get(0).getOrder_name();
		System.out.println(order_name);
	}
	
	@Test
	public void getAll(){
		
	}
	
	@Test
	public void delete(){
		customerMapper.deleteById(1l);
	}
	
	@Test
	public void deleteAll(){
		
	}

}
