package nLayeredDemoV1.business.concretes;

import java.util.List;

import nLayeredDemoV1.business.abstracts.ProductService;
import nLayeredDemoV1.core.LoggerService;
import nLayeredDemoV1.dataAccess.abstracts.ProductDao;
import nLayeredDemoV1.entities.concretes.Product;

public class ProductManager implements ProductService{

   private ProductDao productDao;
   private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
	super();
	this.productDao = productDao;
	this.loggerService=loggerService;
}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		//Örnek Kodlar
		
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün Kabul edilmiyor");
		    return;			
		}
		
		
		this.productDao.add(product);
		this.loggerService.logToSystem("ürün eklendi : "+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
