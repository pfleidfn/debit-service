package com.example.debit.contract;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.debit.service.DebitService;

public class DebitBase extends MockMvcBase {

    @MockBean
    private DebitService debitService;

    @Before
    public void configureDebitServiceMock() {
        when(debitService.customerIsOnBlacklist("max.mustermann")).thenReturn(true);
        when(debitService.ccNumberInvalid("123456")).thenReturn(true);
    }

}
