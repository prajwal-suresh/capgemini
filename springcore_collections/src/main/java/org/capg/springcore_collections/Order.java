package org.capg.springcore_collections;

public class Order {
	private int orderId;
	private String ordername;
	private String orderCity;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String ordername, String orderCity) {
		super();
		this.orderId = orderId;
		this.ordername = ordername;
		this.orderCity = orderCity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrderCity() {
		return orderCity;
	}
	public void setOrderCity(String orderCity) {
		this.orderCity = orderCity;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", ordername=" + ordername + ", orderCity=" + orderCity + "]";
	}
	

}
