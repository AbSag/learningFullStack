package one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.Order;

@Entity
@Table(name="customers")
public class Customers {

	@Id
	@Column(name="CUSTID")
	private int custId;
	
	@Column(name="CNAME",length=10)
	private String custName;
	
	@Column(name="ADDRESS",length=10)
	private String custAddress;
	
	@Column(name="CITY",length=10)
	private String city;
	
	@Column(name="STATE",length=10)
	private String state;
	
	@Column(name="ZIP",length=10)
	private double zip;
	
	@Column(name="AREA",length=10)
	private String area;
	
	@Column(name="PHONE",length=10)
	private double phone;
	
	@Column(name="EMPID",length=10)
	private int empid;
	
	@Column(name="CREDITLIMIT",length=10)
	private int creditLimit;
	
	 @ManyToOne
	 @JoinColumn(name="EMPNO")
	 private Employee employee;
	 
	 @OneToMany(mappedBy="order", fetch = FetchType.EAGER, cascade = CascadeType.ALL )
	 private List<Order> orderList;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getZip() {
		return zip;
	}

	public void setZip(double zip) {
		this.zip = zip;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	 
	 
	 
}
