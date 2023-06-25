package com.example.onlineshop.repositories.products;

import com.example.onlineshop.entities.products.Feature;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends PagingAndSortingRepository<Feature, Long> {
}
