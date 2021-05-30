package ygtcvk.kodlamaio.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ygtcvk.kodlamaio.business.abstracts.ProductService;
import ygtcvk.kodlamaio.core.utilities.results.DataResult;
import ygtcvk.kodlamaio.core.utilities.results.Result;
import ygtcvk.kodlamaio.core.utilities.results.SuccessDataResult;
import ygtcvk.kodlamaio.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new  SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
					
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

}
