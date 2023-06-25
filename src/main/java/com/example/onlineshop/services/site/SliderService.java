package com.example.onlineshop.services.site;

import com.example.onlineshop.entities.site.Slider;
import com.example.onlineshop.repositories.site.SliderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SliderService {
    @Autowired
    private SliderRepository repository;
    public List<Slider> findAllOrderByItemOrder(){
        return (List<Slider>) repository.findAll(Sort.by("itemOrder"));
    }
}
