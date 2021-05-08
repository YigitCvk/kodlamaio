package nLayeredDemoV1;

import nLayeredDemoV1.business.abstracts.ProductService;
import nLayeredDemoV1.business.concretes.ProductManager;
import nLayeredDemoV1.core.JLoggerManagerAdapter;
import nLayeredDemoV1.dataAccess.concretes.AbcProductDao;
import nLayeredDemoV1.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TODO : Spring IoC ile çözülecek
		
		ProductService productService=new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter()); 
		
		Product product=new Product(1,2," Elma",12,50);
		productService.add(product);
			
			

	}

}
