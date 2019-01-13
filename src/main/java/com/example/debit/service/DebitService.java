package com.example.debit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DebitService {

    public boolean ccNumberInvalid(String creditCardNumber) {
        return creditCardNumber.length() != 16;
    }

    public boolean customerIsOnBlacklist(String customerId) {
        List<String> blacklistedCustomers = Arrays.asList("max.mustermann", "otto.normalverbraucher");
        if (blacklistedCustomers.contains(customerId)) {
            return true;
        }
        return false;
    }

}
