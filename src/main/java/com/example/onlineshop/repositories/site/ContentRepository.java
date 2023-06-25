package com.example.onlineshop.repositories.site;

import com.example.onlineshop.entities.site.Content;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends PagingAndSortingRepository<Content, Long> {
}
