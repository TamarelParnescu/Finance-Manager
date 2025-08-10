package com.tamarwell.finance_manager.exception;

public class NullTransactionAmountException extends RuntimeException {
    public NullTransactionAmountException(String message) {
        super(message);
    }
}
