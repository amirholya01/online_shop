package com.example.onlineshop.repositories.invoices;

import com.example.onlineshop.entities.invoices.Invoice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {
}
