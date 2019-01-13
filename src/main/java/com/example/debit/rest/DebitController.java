package com.example.debit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.debit.domain.DebitRequest;
import com.example.debit.domain.DebitResponse;
import com.example.debit.domain.DebitStatus;
import com.example.debit.service.DebitService;

@RestController
public class DebitController {

    private static final String NO_REASON = null;
    private static final String INVALID_CC_NUMBER = "Credit card number is invalid";
    private static final String CUSTOMER_ON_BLACKLIST = "Customer is on Blacklist";

    @Autowired
    private DebitService debitService;

    @PostMapping(value = "/debit")
    public DebitResponse debitCustomer(@RequestBody DebitRequest orderRequest) {

        if (debitService.ccNumberInvalid(orderRequest.getCreditCardNumber())) {
            return new DebitResponse(DebitStatus.INVALID, INVALID_CC_NUMBER, false);
        }

        if (debitService.customerIsOnBlacklist(orderRequest.getCustomerId())) {
            return new DebitResponse(DebitStatus.INVALID, CUSTOMER_ON_BLACKLIST, true);
        }

        return new DebitResponse(DebitStatus.OK, NO_REASON, false);

    }


}
