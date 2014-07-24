package baco.web.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import baco.web.model.ProductEntity;

public interface IProductRepository extends JpaRepository<ProductEntity, Long>{

}


