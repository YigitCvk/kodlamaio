package ygtcvk.kodlamaio.business.abstracts;

import java.util.List;

import ygtcvk.kodlamaio.core.utilities.results.DataResult;
import ygtcvk.kodlamaio.core.utilities.results.Result;
import ygtcvk.kodlamaio.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);

}
