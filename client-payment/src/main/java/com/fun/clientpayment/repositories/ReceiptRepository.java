package com.fun.clientpayment.repositories;


import com.fun.clientpayment.model.Receipt;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ReceiptRepository extends ElasticsearchRepository<Receipt, String> {
}

