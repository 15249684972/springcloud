package cn.wk.springcloud.mapper.manytoonemapper;

import org.springframework.data.repository.CrudRepository;

import cn.wk.springcloud.model.manytoone.Customer;

public interface CustomerTwoMapper extends CrudRepository<Customer, Long>{

}
