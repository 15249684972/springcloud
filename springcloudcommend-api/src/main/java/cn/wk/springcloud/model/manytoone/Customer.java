package cn.wk.springcloud.model.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Accessors(chain=true)
@Table(name="customer2")
public class Customer {

	@Id
	@Column(name="customer_id")
	private Long customer_id;
	
	@Column(name="customer_name")
	private String customer_name;
	
	
}
