package com.fun.clientcoreapi.data.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Data
public class ClientResponse {
    private UUID clientId;
    private String clientName;
    private String clientSurname;
}
