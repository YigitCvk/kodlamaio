package ygtcvk.kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ygtcvk.kodlamaio.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	/*crud operasyonları*/
}
