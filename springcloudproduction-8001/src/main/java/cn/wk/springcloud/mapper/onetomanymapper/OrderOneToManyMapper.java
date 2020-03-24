package cn.wk.springcloud.mapper.onetomanymapper;

import org.springframework.data.repository.CrudRepository;

import cn.wk.springcloud.model.onetomany.Order;

public interface OrderOneToManyMapper extends CrudRepository<Order, Long>{

}
