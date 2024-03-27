package com.fun.clientpayment.proxy;

import com.fun.clientpayment.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "clients", url = "http://localhost:8082")
public interface PostClientsProxy {

    @GetMapping("/clients/client/{clientId}")
    ResponseEntity<Client> getClients(@PathVariable UUID clientId);


    @GetMapping("/clients")
    ResponseEntity<List<Client>> getClients();

}
