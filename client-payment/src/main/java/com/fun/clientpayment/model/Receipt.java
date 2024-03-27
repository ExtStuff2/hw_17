package com.fun.clientpayment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "receipts")
public class Receipt {
    @Id
    private String id;
    @Field(type = FieldType.Text)
    private String clientId;
    @Field(type = FieldType.Text)
    private String serviceName;
    @Field(type = FieldType.Double)
    private double servicePrice;
    // Other fields
    private Map<String, Object> additionalServices = new HashMap<>();

    public void addField(String fieldName, Object value) {
        additionalServices.put(fieldName, value);
    }

    public Map<String, Object> getAdditionalServices() {
        return additionalServices;
    }
}
