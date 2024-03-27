package com.fun.clientpayment.service;


import com.fun.clientpayment.model.Receipt;
import com.fun.clientpayment.repositories.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReceiptService {
    @Autowired
    private ReceiptRepository repository;

    public Receipt saveOrUpdateReceipt(Receipt receipt) {
        return repository.save(receipt);
    }

    public Page<Receipt> getAllReceipts(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Receipt getReceiptById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteReceiptById(String id) {
        repository.deleteById(id);
    }

    public Receipt updateReceiptDocument(String id, String fieldName, double fieldValue) {
        Optional<Receipt> optionalDocument = repository.findById(id);
        if (optionalDocument.isPresent()) {
            Receipt document = optionalDocument.get();
            document.addField(fieldName, fieldValue);
            return repository.save(document);
        }
        return null;
    }
}

