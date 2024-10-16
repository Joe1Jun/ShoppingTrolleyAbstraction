package ie.atu.sw;

import java.util.*;

public class OrderImpl implements Order {
	private String orderNumber;
	private Date orderDate = new Date();
	private List<LineItem> items = new ArrayList<LineItem>();

	
	
	
	
	public OrderImpl(String orderNumber) {
		
		this.orderNumber = orderNumber;
	}


	public OrderImpl(String orderNumber, Date orderDate) {
		
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
	}


	public String getOrderNumber() {
		
		return this.orderNumber;
	}

	
	public Date getOrderDate() {
		
		return this.orderDate;
	}

	
	public boolean addItem(LineItem item) {
		
		return items.add(item);
	}

	
	public boolean removeItem(LineItem item) {
		
		return items.remove(item);
	}

	
	public LineItem[] items() {
		
		LineItem [] temp = new LineItem[items.size()];
		
		for(int i = 0 ; i < items.size(); i++) {
			
			temp[i] = items.get(i);
		}
		return temp;
	}

	
	public float getTotal() {
	
		
		float total = 0.0f;
		
		for (LineItem item : items){
			total +=(item.getItemQuantity() * item.getItemPrice());
			
		}
		
		return total;
	}
	
	

}
