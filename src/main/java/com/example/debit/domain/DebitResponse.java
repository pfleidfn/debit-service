package com.example.debit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Domain object of the result of a debit placement.
 */
@Data
@AllArgsConstructor
public class DebitResponse {

    private DebitStatus debitStatus;

    private String rejectionReason;

    private boolean onBlacklist;

}
