package nLayeredDemoV1.dataAccess.concretes;

import java.util.List;

import nLayeredDemoV1.dataAccess.abstracts.ProductDao;
import nLayeredDemoV1.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		//Örnek Kodlar
		System.out.println("Hibernate ile Eklendi"+product.getName());
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
