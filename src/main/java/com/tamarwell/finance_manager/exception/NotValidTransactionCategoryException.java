package com.tamarwell.finance_manager.exception;

public class NotValidTransactionCategoryException extends RuntimeException{
    public NotValidTransactionCategoryException(String message) {
        super(message);
    }
}