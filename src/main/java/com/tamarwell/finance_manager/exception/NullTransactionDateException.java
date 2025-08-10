package com.tamarwell.finance_manager.exception;

public class NullTransactionDateException extends RuntimeException {
    public NullTransactionDateException(String message) {
        super(message);
    }
}

