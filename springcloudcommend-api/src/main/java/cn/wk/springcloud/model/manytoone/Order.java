package cn.wk.springcloud.model.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Accessors(chain = true)
@Table(name = "order2")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long order_id;

	@Column(name = "order_name")
	private String order_name;

	@JoinColumn(name = "customer_id")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public Customer customer;

}
