package ygtcvk.kodlamaio.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ygtcvk.kodlamaio.business.abstracts.ProductService;
import ygtcvk.kodlamaio.dataAccess.abstracts.ProductDao;
import ygtcvk.kodlamaio.entities.concretes.Product;

@Service/*bu class service görevi görecek anlamında*/
public class ProductManager implements ProductService {
	private ProductDao productDao;
	
	@Autowired /*injeksiyon yapar*/
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
