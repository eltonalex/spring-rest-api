package br.com.lequeinfo.RestAPI.services;

import java.util.List;

import br.com.lequeinfo.RestAPI.models.Product;

public interface ProductService {
	
	public List<Product> findAll();
	public Product find(Long id);
	public Product create(Product product);
	public Product update(Long id, Product product);
	public void delete(Long id);
	
	
}
