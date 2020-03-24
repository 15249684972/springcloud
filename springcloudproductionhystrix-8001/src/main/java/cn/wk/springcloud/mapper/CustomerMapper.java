package cn.wk.springcloud.mapper;

import org.springframework.data.repository.CrudRepository;

import cn.wk.springcloud.model.Customer;

public interface CustomerMapper extends CrudRepository<Customer, Long> {

}
