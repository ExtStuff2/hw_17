package com.fun.clientpayment;

import com.fun.clientpayment.repositories.ReceiptRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackageClasses = ReceiptRepository.class)
@EnableFeignClients(basePackages = "com.fun.clientpayment.proxy")
public class ClientPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientPaymentApplication.class, args);
    }

}
