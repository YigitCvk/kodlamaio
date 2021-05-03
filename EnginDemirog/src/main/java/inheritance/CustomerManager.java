package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.err.println(customer.customerNumber+" Kaydedildi");
	}
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer:customers) {
			add(customer);
		}
	}
	

}
