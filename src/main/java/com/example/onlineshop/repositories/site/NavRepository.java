package com.example.onlineshop.repositories.site;

import com.example.onlineshop.entities.site.Nav;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NavRepository extends PagingAndSortingRepository<Nav, Long> {
}
