package com.selenium.yatra.utility;

import okhttp3.internal.http2.ErrorCode;

public class CustomException extends Exception {

    ExceptionType type;

    public enum ExceptionType {
        FILE_NOT_EXIST,
    }

    public CustomException(ExceptionType type, String message) {

        super(message);
        this.type = type;
    }
}
