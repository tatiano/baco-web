package baco.web.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import baco.web.model.CategoryEntity;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long>{

}
