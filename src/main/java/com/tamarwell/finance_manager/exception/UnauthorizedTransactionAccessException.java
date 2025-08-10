package com.tamarwell.finance_manager.exception;

public class UnauthorizedTransactionAccessException extends RuntimeException {
    public UnauthorizedTransactionAccessException(String message) {
        super(message);
    }
}