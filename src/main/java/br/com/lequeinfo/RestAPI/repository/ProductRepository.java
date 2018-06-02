package br.com.lequeinfo.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lequeinfo.RestAPI.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
