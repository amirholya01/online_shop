package com.example.onlineshop.repositories.products;

import com.example.onlineshop.entities.products.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    @Query("from Product where category.id = :categoryId")
    List<Product> findAllByCategory(long categoryId);
}
