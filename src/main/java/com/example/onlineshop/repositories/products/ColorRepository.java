package com.example.onlineshop.repositories.products;

import com.example.onlineshop.entities.products.Color;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends PagingAndSortingRepository<Color, Long> {
}
