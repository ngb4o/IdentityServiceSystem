package com.example.identityservice.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1001, "Uncategorized error"),
    USER_EXITED(1002, "User existed"),
    USERNAME_INVALID(1003, "Username must be at least 3 character"),
    PASSWORD_INVALID(1004, "Password must be at least 8 character")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

     int code;
     String message;

}
