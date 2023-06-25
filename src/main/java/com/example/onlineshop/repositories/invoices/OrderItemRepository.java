package com.example.onlineshop.repositories.invoices;

import com.example.onlineshop.entities.invoices.OrderItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long> {
}
