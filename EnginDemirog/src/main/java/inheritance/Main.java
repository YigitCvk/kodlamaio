package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="999";
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);
		
		CustomerManager customerManager2=new CustomerManager();
		Customer[] customers= {engin,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);
		
	
		
		

	}

}
