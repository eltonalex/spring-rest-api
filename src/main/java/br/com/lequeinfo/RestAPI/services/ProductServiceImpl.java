package br.com.lequeinfo.RestAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lequeinfo.RestAPI.models.Product;
import br.com.lequeinfo.RestAPI.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		// TODO Auto-generated constructor stub
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product find(Long id) {
		// TODO Auto-generated method stub
		return this.productRepository.findOne(id);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		this.productRepository.save(product);
		return product;
	}

	@Override
	public Product update(Long id, Product product) {
		// TODO Auto-generated method stub
		Product productFound = this.productRepository.findOne(id);
		
		if(productFound != null) {
			product.setId(productFound.getId());
			this.productRepository.save(product);
			return product;
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Product product = this.productRepository.findOne(id);
		if(product != null)
		this.productRepository.delete(product);
		
	}
	
}
