package com.example.onlineshop.repositories.products;

import com.example.onlineshop.entities.products.Size;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends PagingAndSortingRepository<Size, Long> {
}
