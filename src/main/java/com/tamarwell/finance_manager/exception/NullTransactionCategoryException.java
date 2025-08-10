package com.tamarwell.finance_manager.exception;

public class NullTransactionCategoryException extends RuntimeException{
    public NullTransactionCategoryException(String message) {
        super(message);
    }
}