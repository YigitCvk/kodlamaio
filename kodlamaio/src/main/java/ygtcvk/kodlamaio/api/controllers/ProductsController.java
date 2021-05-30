package ygtcvk.kodlamaio.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ygtcvk.kodlamaio.business.abstracts.ProductService;
import ygtcvk.kodlamaio.core.utilities.results.DataResult;
import ygtcvk.kodlamaio.core.utilities.results.Result;
import ygtcvk.kodlamaio.entities.concretes.Product;

@RestController/*Spring den geliyor-sen bir controllersın demek*/
@RequestMapping("/api/products")/*birden fazla controller olabilir bunu karşılar */

public class ProductsController {
/*controller - dış dünya ile iletişim kurulan yer */
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
	
	this.productService = productService;
}

	@GetMapping("/getall")/*yapılan istekleri karşılar(dış dünyada)*/
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody  Product product) {
		return this.productService.add(product);
	}
}
