package com.tamarwell.finance_manager.exception;

public class NotValidTransactionSubcategoryException extends RuntimeException{
    public NotValidTransactionSubcategoryException(String message) {
        super(message);
    }
}