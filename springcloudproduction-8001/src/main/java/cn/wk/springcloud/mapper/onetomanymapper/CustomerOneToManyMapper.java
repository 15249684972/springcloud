package cn.wk.springcloud.mapper.onetomanymapper;

import org.springframework.data.repository.CrudRepository;

import cn.wk.springcloud.model.onetomany.Customer;

public interface CustomerOneToManyMapper extends CrudRepository<Customer, Long>{

}
