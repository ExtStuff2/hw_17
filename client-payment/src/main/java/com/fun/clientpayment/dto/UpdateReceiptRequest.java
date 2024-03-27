package com.fun.clientpayment.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UpdateReceiptRequest {
    private String serviceName;
    private double servicePrice;
}
