package cn.wk.springcloud.model.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Cacheable(true)  //添加Cacheable
@Table(name = "customer3")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customer_id;

	@Column(name = "customer_name")
	private String customer_name;

	@JoinColumn(name = "customer_id")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Order> orders = new ArrayList<Order>();
}
