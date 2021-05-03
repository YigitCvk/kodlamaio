package oopIntro.com;

import sun.misc.Cache;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1=new Product(1, "Lenovo v14", 15000, "16 gb ram", 10, 13500);
		
		Product product2=new Product();
		
		product2.setId(2);
		product2.setName("Lenovo v15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("yiyecek");
		
		System.out.println(category1.getId());
		System.out.println(category1.getName());
	}

}
