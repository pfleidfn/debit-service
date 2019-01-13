package com.example.debit.domain;

import lombok.Data;

/**
 * Domain object of debit requests.
 */
@Data
public class DebitRequest {

    private String customerId;

    private String creditCardNumber;

    private float amount;

}
