package com.ecommerce.backend.ProductManagement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByCategory(String category);
  
}
