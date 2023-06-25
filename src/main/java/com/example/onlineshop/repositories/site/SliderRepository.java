package com.example.onlineshop.repositories.site;

import com.example.onlineshop.entities.site.Slider;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SliderRepository extends PagingAndSortingRepository<Slider, Long> {
    @Override
    List<Slider> findAll();
}
