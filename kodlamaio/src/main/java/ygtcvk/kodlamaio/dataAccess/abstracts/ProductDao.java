package ygtcvk.kodlamaio.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ygtcvk.kodlamaio.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	/*crud operasyonları*/
	
	Product getByProductName (String productName);
	
	Product getByProductNameAndcCategoryId(String productName,int categoryId);
	
	List<Product>getByProductNameOrCategoryId(String productName,int categoryId);
	
	List<Product>getByCategoryIdIn(List<Integer>categories);
	
	List<Product>getByProductNameContain(String productName);
	
	List<Product>getByProductNameStarsWith(String productName);
	
	@Query("")
	List<Product>GetByNameAndCategory(String productName,int categoryId);
	
}
