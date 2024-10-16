package ie.atu.sw;

import java.util.*;

public interface Order {
	
	// Cannot intialise objects of these interfaces. They are abstract
	// Need to create Objects from the classes that implement these interfaces 
	// in order to use them.

	public String getOrderNumber();
	public Date getOrderDate();
	public boolean addItem(LineItem item );
	public boolean removeItem(LineItem item);
	public LineItem [] items ();
	public float getTotal();
	
}
