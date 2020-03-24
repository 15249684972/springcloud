package cn.wk.springcloud.mapper.manytoonemapper;

import org.springframework.data.repository.CrudRepository;

import cn.wk.springcloud.model.manytoone.Order;

public interface OrderMapper extends CrudRepository<Order, Long> {

}
