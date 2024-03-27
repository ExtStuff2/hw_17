package com.fun.clientpayment.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Client {

    private UUID clientId;
    private String clientName;

    private String clientSurname;
}
