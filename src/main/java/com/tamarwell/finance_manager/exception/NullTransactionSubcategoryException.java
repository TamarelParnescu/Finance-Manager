package com.tamarwell.finance_manager.exception;

public class NullTransactionSubcategoryException extends RuntimeException{
    public NullTransactionSubcategoryException(String message) {
        super(message);
    }
}