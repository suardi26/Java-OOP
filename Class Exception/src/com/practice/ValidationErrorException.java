package com.practice;

public class ValidationErrorException extends Error{

    public ValidationErrorException(String message){
        super(message);
    }

    public static void validate3 (String username, String pwd){
        if (username == null || pwd == null ){
            throw new ValidationErrorException("username atau password tidak valid !");
        }
    }
}
